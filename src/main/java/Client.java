import com.google.gson.Gson;
import entity.Match;
import entity.MatchList;
import entity.MatchReference;
import entity.Summoner;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Client {

    private String[] headers = {"Origin","https://developer.riotgames.com",
            "Accept-Charset","application/x-www-form-urlencoded; charset=UTF-8",
            "Accept-Language","sv-SE,sv;q=0.9,en-SE;q=0.8,en;q=0.7,en-US;q=0.6",
            "User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36"
    ,"X-Riot-Token",""};

    MatchList matches;
    Summoner summoner;
    HttpClient client;
    HttpRequest request;
    Match match;
    Gson gson = new Gson();

    public Client(String APIKey){
        headers[9] = APIKey;
    }
    private final String MATCH_LIST_PATH = "https://euw1.api.riotgames.com/lol/match/v4/matchlists/by-account/";
    private final String MATCH_BY_MATCHID = "https://euw1.api.riotgames.com/lol/match/v4/matches/";
    private final String SUMMONER_BY_NAME = "https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/";


    public Summoner getSummonerbyName(String summonerName){

        client = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder(URI.create(SUMMONER_BY_NAME + summonerName))
                .headers(headers).GET().build();
        try {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String content = response.body();
            summoner = gson.fromJson(content,Summoner.class);

        }catch (Exception e){
            e.printStackTrace();
        }
        return summoner;
    }

    public List<MatchReference> getMatchListByAccountId(String accountId){


        request = HttpRequest.newBuilder(URI.create(MATCH_LIST_PATH + accountId ))
        .headers(headers).GET().build();
        try {
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        String content = response.body();
        matches = gson.fromJson(content, MatchList.class);
        }catch (Exception e){
            e.printStackTrace();
        }

        return matches.getMatches();
    }

    public Match getMatchByMatchId(long gameId){

        client = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder(URI.create(MATCH_BY_MATCHID + gameId))
                .headers(headers).GET().build();
        try {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String content = response.body();
            match = gson.fromJson(content,Match.class);

        }catch (Exception e){
            e.printStackTrace();
        }
        return match;
    }

}
