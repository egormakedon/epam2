package by.tc.task01.entity;

public class Oven extends Appliance {
    private static long idCounter = 0;
    private long ovenId;
    private short powerConsumption;
    private short weight;
    private short capacity;
    private short depth;
    private float height;
    private float width;

    public Oven(short powerConsumption, short weight, short capacity, short depth, float height, float width) {
        ovenId = incrementIdCounter();
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public void setPowerConsumption(short powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public void setDepth(short depth) {
        this.depth = depth;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public long getOvenId() {
        return ovenId;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "ovenId=" + ovenId +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oven oven = (Oven) o;

        if (ovenId != oven.ovenId) return false;
        if (powerConsumption != oven.powerConsumption) return false;
        if (weight != oven.weight) return false;
        if (capacity != oven.capacity) return false;
        if (depth != oven.depth) return false;
        if (Double.compare(oven.height, height) != 0) return false;
        return Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (ovenId ^ (ovenId >>> 32));
        result = 31 * result + powerConsumption;
        result = 31 * result + weight;
        result = 31 * result + capacity;
        result = 31 * result + depth;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    private long incrementIdCounter() {
        return ++idCounter;
    }
}
