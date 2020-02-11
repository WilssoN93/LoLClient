package entity;

import com.stirante.lolclient.ClientApi;
import com.stirante.lolclient.ClientConnectionListener;
import com.stirante.lolclient.ClientWebSocket;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.IOException;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.*;

public class LCUClient {

    ClientApi api;
    Client client;
    ClientWebSocket socket;
    Set<Integer> championIds= new HashSet<>();
    Map<Integer,Champion> champions = new HashMap<>();
    private static DecimalFormat df = new DecimalFormat("00.0");

    public LCUClient() {
        client = new Client();
        api = new ClientApi();
    }

    public String getCurrentSummoner() {

        api.addClientConnectionListener(new ClientConnectionListener() {
            @Override
            public void onClientConnected() {
                try {
                    if(!api.isAuthorized()){
                        System.out.println("Not logged in!");
                        return;
                    }

                    fillChampionList();
                    matchList();
                    System.out.println("logged in");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onClientDisconnected() {
                System.out.println("client disconnected!");
            }
        });

        return null;
    }


    public MatchList matchList(){
        List<Summoner> summoners = new ArrayList<>();

        try {
            socket = api.openWebSocket();
            socket.setSocketListener(new ClientWebSocket.SocketListener() {
                boolean sessionNotInProgress = true;
                @Override
                public void onEvent(ClientWebSocket.Event event) {
                    if(event.getUri().equals("/lol-champ-select/v1/session") && sessionNotInProgress){
                        sessionNotInProgress = false;
                        for (Player player:getSession().getMyTeam()) {
                          Summoner summoner = getSummoner(player);
                          summoners.add(summoner);
                        }
                        for (Player player:getSession().getTheirTeam()) {
                            Summoner summoner = getSummoner(player);
                            summoners.add(summoner);
                        }
                        for (Summoner summoner:summoners) {
                            System.out.println(summoner.getDisplayName());
                            try {
                                Match[] matches = api.executeGet("/lol-career-stats/v1/summoner-games/"+summoner.getPuuid(),Match[].class);
                                for (Match match: matches) {
                                    championIds.add(match.getChampionId());
                                }
                                for (Integer championId:championIds) {
                                    double wonGames = 0;
                                    List<Match> championMatch = new ArrayList<>();
                                    for (Match match:matches) {
                                        if (match.getChampionId() == championId) {
                                            championMatch.add(match);
                                            if (match.getStats().getCarrerStats().getVictory() == 1) {
                                                wonGames++;
                                            }
                                        }
                                    }
                                 double sum = wonGames / championMatch.size() * 100;
                                    System.out.println(df.format(sum) + "% " + champions.get(championId).getName());
                                }

                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    }

                }

                @Override
                public void onClose(int i, String s) {
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private Session getSession(){

        Session session = null;

        try {
            session = api.executeGet("/lol-champ-select/v1/session",Session.class);
        }catch (IOException e){
            e.printStackTrace();
        }

        return session;
    }

    private Summoner getSummoner(Player player){
        try {
            return api.executeGet("/lol-summoner/v1/summoners/" + player.getSummonerId(),Summoner.class);
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    private void fillChampionList(){
        try {
            Champion[] champs = api.executeGet("/lol-champ-select/v1/all-grid-champions",Champion[].class);
            for (Champion champ:champs) {
                champions.put(champ.getId(),champ);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
