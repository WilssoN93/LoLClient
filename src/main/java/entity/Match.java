package entity;

public class Match {

    private int championId;
    private String lane;
    private Stats stats;
    private int season;
    private String queueType;
    private long gameId;
    private String platformId;

    @Override
    public String toString() {
        return "Match{" +
                "championId=" + championId +
                ", lane='" + lane + '\'' +
                ", stats=" + stats +
                ", seasonId=" + season +
                ", queueType=" + queueType +
                ", gameId=" + gameId +
                ", platformId='" + platformId + '\'' +
                '}';
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }
}
