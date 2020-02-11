package entity;

public class Player {

    private int summonerId;
    private String assignedPosition;

    public String getAssignedPosition() {
        return assignedPosition;
    }

    public void setAssignedPosition(String assignedPosition) {
        this.assignedPosition = assignedPosition;
    }

    public int getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(int summonerId) {
        this.summonerId = summonerId;
    }

    @Override
    public String toString() {
        return "Player{" +
                "summonerId=" + summonerId +
                ", assignedPosition='" + assignedPosition + '\'' +
                '}';
    }
}
