package entity;

public class ParticipantIdentity {


    private Player player;
    private int participantId;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    @Override
    public String toString() {
        return "ParticipantIdentity{" +
                "player=" + player +
                ", participantId=" + participantId +
                '}';
    }
}
