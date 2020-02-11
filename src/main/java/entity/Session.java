package entity;

import java.util.List;

public class Session {

    List<Player> theirTeam;
    List<Player> myTeam;

    @Override
    public String toString() {
        return "Session{" +
                "theirTeam=" + theirTeam +
                ", myTeam=" + myTeam +
                '}';
    }

    public List<Player> getTheirTeam() {
        return theirTeam;
    }

    public void setTheirTeam(List<Player> theirTeam) {
        this.theirTeam = theirTeam;
    }

    public List<Player> getMyTeam() {
        return myTeam;
    }

    public void setMyTeam(List<Player> myTeam) {
        this.myTeam = myTeam;
    }
}
