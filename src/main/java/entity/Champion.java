package entity;

public class Champion {

    private int id;
    private String name;
    private String squarePortraitPath;


    @Override
    public String toString() {
        return "Champion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", squarePortraitPath='" + squarePortraitPath + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSquarePortraitPath() {
        return squarePortraitPath;
    }

    public void setSquarePortraitPath(String squarePortraitPath) {
        this.squarePortraitPath = squarePortraitPath;
    }
}
