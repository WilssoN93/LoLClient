package entity;

import java.util.List;

public class Participant {

    private ParticipantStats stats;
    private int participantId;
    private List<Rune> runes;
    private ParticipantTimeline timeline;
    private int teamId;
    private int spell2Id;
    private List<Mastery> masteries;
    private String highestAchievedSeasonTier;
    private int getSpell1Id;
    private int championId;

    public ParticipantStats getStats() {
        return stats;
    }

    public void setStats(ParticipantStats stats) {
        this.stats = stats;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public void setRunes(List<Rune> runes) {
        this.runes = runes;
    }

    public ParticipantTimeline getTimeline() {
        return timeline;
    }

    public void setTimeline(ParticipantTimeline timeline) {
        this.timeline = timeline;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(int spell2Id) {
        this.spell2Id = spell2Id;
    }

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public void setMasteries(List<Mastery> masteries) {
        this.masteries = masteries;
    }

    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public void setHighestAchievedSeasonTier(String highestAchievedSeasonTier) {
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
    }

    public int getGetSpell1Id() {
        return getSpell1Id;
    }

    public void setGetSpell1Id(int getSpell1Id) {
        this.getSpell1Id = getSpell1Id;
    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "stats=" + stats +
                ", participantId=" + participantId +
                ", runes=" + runes +
                ", timeline=" + timeline +
                ", teamId=" + teamId +
                ", spell2Id=" + spell2Id +
                ", masteries=" + masteries +
                ", highestAchievedSeasonTier='" + highestAchievedSeasonTier + '\'' +
                ", getSpell1Id=" + getSpell1Id +
                ", championId=" + championId +
                '}';
    }
}
