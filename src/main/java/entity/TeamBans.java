package entity;

public class TeamBans {

    private int pickTurn;
    private int championId;

    public int getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(int pickTurn) {
        this.pickTurn = pickTurn;
    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    @Override
    public String toString() {
        return "TeamBans{" +
                "pickTurn=" + pickTurn +
                ", championId=" + championId +
                '}';
    }
}
