import entity.*;

import java.util.List;

public class Main {


    public static void main(String[] args) {
     //String summonerName = args[0];
        // String APIKey = args[1];
       // Client client = new Client(APIKey);
       // Main.run(summonerName,client);

        LCUClient client= new LCUClient();
        client.getCurrentSummoner();

    }

    private static void run(String summonerName , Client client){
        Summoner summoner = client.getSummonerbyName(summonerName);
        List<MatchReference> matches = client.getMatchListByAccountId(summoner.getAccountId());
        Match game = client.getMatchByMatchId(matches.get(0).getGameId());
        for (ParticipantIdentity participantIdentity:game.getParticipantIdentities()) {
            System.out.println(participantIdentity.getPlayer().getSummonerName());
        }
    }

}
