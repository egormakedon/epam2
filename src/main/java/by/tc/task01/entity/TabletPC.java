package by.tc.task01.entity;

public class TabletPC extends Appliance {
    private static long idCounter = 0;
    private long tabletPCId;
    private short batteryCapacity;
    private short displayInches;
    private short memoryRom;
    private short flashMemoryCapacity;
    private String color;

    public TabletPC(short batteryCapacity, short displayInches, short memoryRom, short flashMemoryCapacity, String color) {
        tabletPCId = incrementIdCounter();
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public void setBatteryCapacity(short batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setDisplayInches(short displayInches) {
        this.displayInches = displayInches;
    }

    public void setMemoryRom(short memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setFlashMemoryCapacity(short flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getTabletPCId() {
        return tabletPCId;
    }

    public short getBatteryCapacity() {
        return batteryCapacity;
    }

    public short getDisplayInches() {
        return displayInches;
    }

    public short getMemoryRom() {
        return memoryRom;
    }

    public short getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "tabletPCId=" + tabletPCId +
                ", batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (tabletPCId != tabletPC.tabletPCId) return false;
        if (batteryCapacity != tabletPC.batteryCapacity) return false;
        if (displayInches != tabletPC.displayInches) return false;
        if (memoryRom != tabletPC.memoryRom) return false;
        if (flashMemoryCapacity != tabletPC.flashMemoryCapacity) return false;
        return color != null ? color.equals(tabletPC.color) : tabletPC.color == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (tabletPCId ^ (tabletPCId >>> 32));
        result = 31 * result + (int) batteryCapacity;
        result = 31 * result + (int) displayInches;
        result = 31 * result + (int) memoryRom;
        result = 31 * result + (int) flashMemoryCapacity;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    private long incrementIdCounter() {
        return ++idCounter;
    }
}
