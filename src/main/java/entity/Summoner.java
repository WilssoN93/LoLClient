package entity;

public class Summoner {

    private int accountId;
    private String displayName;
    private String internalName;
    private int percentCompleteForNextLevel;
    private int profileIconId;
    private String puuid;
    private int summonerId;
    private int summonerLevel;
    private int xpSinceLastLevel;
    private int xpUntilNextLevel;


    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public int getPercentCompleteForNextLevel() {
        return percentCompleteForNextLevel;
    }

    public void setPercentCompleteForNextLevel(int percentCompleteForNextLevel) {
        this.percentCompleteForNextLevel = percentCompleteForNextLevel;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public int getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(int summonerId) {
        this.summonerId = summonerId;
    }

    public int getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(int summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public int getXpSinceLastLevel() {
        return xpSinceLastLevel;
    }

    public void setXpSinceLastLevel(int xpSinceLastLevel) {
        this.xpSinceLastLevel = xpSinceLastLevel;
    }

    public int getXpUntilNextLevel() {
        return xpUntilNextLevel;
    }

    public void setXpUntilNextLevel(int xpUntilNextLevel) {
        this.xpUntilNextLevel = xpUntilNextLevel;
    }

    @Override
    public String toString() {
        return "Summoner{" +
                "accountId=" + accountId +
                ", displayName='" + displayName + '\'' +
                ", internalName='" + internalName + '\'' +
                ", percentCompleteForNextLevel=" + percentCompleteForNextLevel +
                ", profileIconId=" + profileIconId +
                ", puuid='" + puuid + '\'' +
                ", summonerId=" + summonerId +
                ", summonerLevel=" + summonerLevel +
                ", xpSinceLastLevel=" + xpSinceLastLevel +
                ", xpUntilNextLevel=" + xpUntilNextLevel +
                '}';
    }
}

