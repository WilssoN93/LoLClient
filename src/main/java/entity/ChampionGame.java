package entity;

import java.util.List;

public class ChampionGame implements Comparable<ChampionGame> {

    private Champion champion;
    private List<Match> games;
    private int totalGames;
    private double wonGames;


    public Champion getChampion() {
        return champion;
    }

    public void setChampion(Champion champion) {
        this.champion = champion;
    }

    public List<Match> getGames() {
        return games;
    }

    public void setGames(List<Match> games) {
        this.games = games;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    public double getWonGames() {
        return wonGames;
    }

    public void setWonGames(double wonGames) {
        this.wonGames = wonGames;
    }

    @Override
    public int compareTo(ChampionGame o) {

        if (this.getWonGames() / this.getTotalGames() > o.getWonGames() / o.getTotalGames()) {
            return -1;
        } else if (this.getWonGames() / this.getTotalGames() < o.getWonGames() / o.getTotalGames()) {
            return 1;
        } else return 0;
    }
}
