package entity;

public class CareerStats {

    private int victory;


    @Override
    public String toString() {
        return "CareerStats{" +
                "victory=" + victory +
                '}';
    }

    public int getVictory() {
        return victory;
    }

    public void setVictory(int victory) {
        this.victory = victory;
    }
}
