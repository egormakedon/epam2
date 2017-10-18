package by.tc.task01.entity;

public class Refrigerator extends Appliance {
    private static long idCounter = 0;
    private long refrigeratorId;
    private short powerConsumption;
    private short weight;
    private short freezerCapacity;
    private float overallCapacity;
    private float height;
    private float width;

    public Refrigerator(short powerConsumption, short weight, short freezerCapacity, float overallCapacity, float height, float width) {
        refrigeratorId = incrementIdCounter();
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public void setPowerConsumption(short powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public void setFreezerCapacity(short freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public long getRefrigeratorId() {
        return refrigeratorId;
    }

    public short getPowerConsumption() {
        return powerConsumption;
    }

    public short getWeight() {
        return weight;
    }

    public short getFreezerCapacity() {
        return freezerCapacity;
    }

    public float getOverallCapacity() {
        return overallCapacity;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "refrigeratorId=" + refrigeratorId +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refrigerator that = (Refrigerator) o;

        if (refrigeratorId != that.refrigeratorId) return false;
        if (powerConsumption != that.powerConsumption) return false;
        if (weight != that.weight) return false;
        if (freezerCapacity != that.freezerCapacity) return false;
        if (Float.compare(that.overallCapacity, overallCapacity) != 0) return false;
        if (Float.compare(that.height, height) != 0) return false;
        return Float.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result = (int) (refrigeratorId ^ (refrigeratorId >>> 32));
        result = 31 * result + (int) powerConsumption;
        result = 31 * result + (int) weight;
        result = 31 * result + (int) freezerCapacity;
        result = 31 * result + (overallCapacity != +0.0f ? Float.floatToIntBits(overallCapacity) : 0);
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        result = 31 * result + (width != +0.0f ? Float.floatToIntBits(width) : 0);
        return result;
    }

    private long incrementIdCounter() {
        return ++idCounter;
    }
}
