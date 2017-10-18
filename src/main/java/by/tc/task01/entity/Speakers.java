package by.tc.task01.entity;

public class Speakers extends Appliance {
    private static long idCounter = 0;
    private long speakersId;
    private short powerConsumption;
    private short numberOfSpeakers;
    private String frequencyRange;
    private short cordLength;

    public Speakers(short powerConsumption, short numberOfSpeakers, String frequencyRange, short cordLength) {
        speakersId = incrementIdCounter();
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public void setPowerConsumption(short powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setNumberOfSpeakers(short numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public void setCordLength(short cordLength) {
        this.cordLength = cordLength;
    }

    public long getSpeakersId() {
        return speakersId;
    }

    public short getPowerConsumption() {
        return powerConsumption;
    }

    public short getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public short getCordLength() {
        return cordLength;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "speakersId=" + speakersId +
                ", powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Speakers speakers = (Speakers) o;

        if (speakersId != speakers.speakersId) return false;
        if (powerConsumption != speakers.powerConsumption) return false;
        if (numberOfSpeakers != speakers.numberOfSpeakers) return false;
        if (cordLength != speakers.cordLength) return false;
        return frequencyRange != null ? frequencyRange.equals(speakers.frequencyRange) : speakers.frequencyRange == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (speakersId ^ (speakersId >>> 32));
        result = 31 * result + (int) powerConsumption;
        result = 31 * result + (int) numberOfSpeakers;
        result = 31 * result + (frequencyRange != null ? frequencyRange.hashCode() : 0);
        result = 31 * result + (int) cordLength;
        return result;
    }

    private long incrementIdCounter() {
        return ++idCounter;
    }
}
