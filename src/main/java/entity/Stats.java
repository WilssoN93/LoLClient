package entity;

import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("CareerStats.js")
    private CareerStats carrerStats;


    @Override
    public String toString() {
        return "Stats{" +
                "carrerStats=" + carrerStats +
                '}';
    }

    public CareerStats getCarrerStats() {
        return carrerStats;
    }

    public void setCarrerStats(CareerStats carrerStats) {
        this.carrerStats = carrerStats;
    }
}
