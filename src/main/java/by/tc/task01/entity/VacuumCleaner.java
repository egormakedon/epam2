package by.tc.task01.entity;

public class VacuumCleaner extends Appliance {
    private static long idCounter = 0;
    private long vacuumCleanerId;
    private short powerConsumption;
    private char filterType;
    private String bagType;
    private String wandType;
    private short motorSpeedRegulation;
    private float cleaningWidth;

    public VacuumCleaner(short powerConsumption, char filterType, String bagType, String wandType, short motorSpeedRegulation, float cleaningWidth) {
        vacuumCleanerId = incrementIdCounter();
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public void setPowerConsumption(short powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setFilterType(char filterType) {
        this.filterType = filterType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public void setMotorSpeedRegulation(short motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public void setCleaningWidth(float cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public long getVacuumCleanerId() {
        return vacuumCleanerId;
    }

    public short getPowerConsumption() {
        return powerConsumption;
    }

    public char getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public short getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public float getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "vacuumCleanerId=" + vacuumCleanerId +
                ", powerConsumption=" + powerConsumption +
                ", filterType=" + filterType +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (vacuumCleanerId != that.vacuumCleanerId) return false;
        if (powerConsumption != that.powerConsumption) return false;
        if (filterType != that.filterType) return false;
        if (motorSpeedRegulation != that.motorSpeedRegulation) return false;
        if (Float.compare(that.cleaningWidth, cleaningWidth) != 0) return false;
        if (bagType != null ? !bagType.equals(that.bagType) : that.bagType != null) return false;
        return wandType != null ? wandType.equals(that.wandType) : that.wandType == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (vacuumCleanerId ^ (vacuumCleanerId >>> 32));
        result = 31 * result + (int) powerConsumption;
        result = 31 * result + (int) filterType;
        result = 31 * result + (bagType != null ? bagType.hashCode() : 0);
        result = 31 * result + (wandType != null ? wandType.hashCode() : 0);
        result = 31 * result + (int) motorSpeedRegulation;
        result = 31 * result + (cleaningWidth != +0.0f ? Float.floatToIntBits(cleaningWidth) : 0);
        return result;
    }

    private long incrementIdCounter() {
        return ++idCounter;
    }
}
