package by.tc.task01.entity;

public class Laptop extends Appliance {
	private static long idCounter = 0;
	private long laptopId;
	private float batteryCapacity;
	private String os;
	private short memoryRom;
	private short systemMemory;
	private float cpu;
	private short displayInches;

    public Laptop(float batteryCapacity, String os, short memoryRom, short systemMemory, float cpu, short displayInches) {
        laptopId = incrementIdCounter();
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemoryRom(short memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(short systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInches(short displayInches) {
        this.displayInches = displayInches;
    }

    public long getLaptopId() {
        return laptopId;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public short getMemoryRom() {
        return memoryRom;
    }

    public short getSystemMemory() {
        return systemMemory;
    }

    public float getCpu() {
        return cpu;
    }

    public short getDisplayInches() {
        return displayInches;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (laptopId != laptop.laptopId) return false;
        if (Float.compare(laptop.batteryCapacity, batteryCapacity) != 0) return false;
        if (memoryRom != laptop.memoryRom) return false;
        if (systemMemory != laptop.systemMemory) return false;
        if (Float.compare(laptop.cpu, cpu) != 0) return false;
        if (displayInches != laptop.displayInches) return false;
        return os != null ? os.equals(laptop.os) : laptop.os == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (laptopId ^ (laptopId >>> 32));
        result = 31 * result + (batteryCapacity != +0.0f ? Float.floatToIntBits(batteryCapacity) : 0);
        result = 31 * result + (os != null ? os.hashCode() : 0);
        result = 31 * result + (int) memoryRom;
        result = 31 * result + (int) systemMemory;
        result = 31 * result + (cpu != +0.0f ? Float.floatToIntBits(cpu) : 0);
        result = 31 * result + (int) displayInches;
        return result;
    }

    private long incrementIdCounter() {
        return ++idCounter;
    }
}
