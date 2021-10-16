package FifthTask;

public class Thing {
    private int volume;
    private int cost;
    private double costV;

    public Thing(int volume, int cost) {
        this.volume = volume;
        this.cost = cost;
        this.costV = (double)((double)cost / (double) volume);
    }

    public double getCostV() {
        return costV;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "volume=" + volume +
                ", cost=" + cost +
                '}';
    }
}
