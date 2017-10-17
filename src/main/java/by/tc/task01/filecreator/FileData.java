package by.tc.task01.filecreator;

import java.util.ArrayList;
import java.util.List;

public class FileData {
    private List<String> ovenList;
    private List<String> laptopList;
    private List<String> refrigeratorList;
    private List<String> vacuumCleanerList;
    private List<String> tabletPCList;
    private List<String> speakersList;

    private List<List<String>> deviceList;
    private final int DEVICE_TYPE_NUM = 6;

    private final String oven1 = "Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5;";
    private final String oven2 = "Oven : POWER_CONSUMPTION=1500, WEIGHT=12, CAPACITY=33, DEPTH=60, HEIGHT=45, WIDTH=68;";
    private final String oven3 = "Oven : POWER_CONSUMPTION=2000, WEIGHT=11, CAPACITY=33, DEPTH=60, HEIGHT=40, WIDTH=70;";

    private final String laptop1 = "Laptop : BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHES=18;";
    private final String laptop2 = "Laptop : BATTERY_CAPACITY=1.5, OS=Linux, MEMORY_ROM=8000, SYSTEM_MEMORY=1000, CPU=2.2, DISPLAY_INCHES=19;";
    private final String laptop3 = "Laptop : BATTERY_CAPACITY=3, OS=Windows, MEMORY_ROM=8000, SYSTEM_MEMORY=1500, CPU=3.2, DISPLAY_INCHES=22;";

    private final String refrigerator1 = "Refrigerator : POWER_CONSUMPTION=100, WEIGHT=20, FREEZER_CAPACITY=10, OVERALL_CAPACITY=300, HEIGHT=200, WIDTH=70;";
    private final String refrigerator2 = "Refrigerator : POWER_CONSUMPTION=200, WEIGHT=30, FREEZER_CAPACITY=15, OVERALL_CAPACITY=300, HEIGHT=180, WIDTH=80;";
    private final String refrigerator3 = "Refrigerator : POWER_CONSUMPTION=150, WEIGHT=35, FREEZER_CAPACITY=20, OVERALL_CAPACITY=350.5, HEIGHT=250, WIDTH=75;";

    private final String vacuumCleaner1 = "VacuumCleaner : POWER_CONSUMPTION=100, FILTER_TYPE=A, BAG_TYPE=A2, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=3000, CLEANING_WIDTH=20;";
    private final String vacuumCleaner2 = "VacuumCleaner : POWER_CONSUMPTION=110, FILTER_TYPE=B, BAG_TYPE=AA-89, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=2900, CLEANING_WIDTH=25;";
    private final String vacuumCleaner3 = "VacuumCleaner : POWER_CONSUMPTION=90, FILTER_TYPE=C, BAG_TYPE=XX00, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=2950, CLEANING_WIDTH=30;";

    private final String tabletPC1 = "TabletPC : BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=2, COLOR=blue;";
    private final String tabletPC2 = "TabletPC : BATTERY_CAPACITY=4, DISPLAY_INCHES=15, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=6, COLOR=red;";
    private final String tabletPC3 = "TabletPC : BATTERY_CAPACITY=5, DISPLAY_INCHES=16, MEMORY_ROM=16000, FLASH_MEMORY_CAPACITY=8, COLOR=green;";

    private final String speakers1 = "Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2;";
    private final String speakers2 = "Speakers : POWER_CONSUMPTION=20, NUMBER_OF_SPEAKERS=3, FREQUENCY_RANGE=3-4, CORD_LENGTH=3;";
    private final String speakers3 = "Speakers : POWER_CONSUMPTION=17, NUMBER_OF_SPEAKERS=4, FREQUENCY_RANGE=2-3.5, CORD_LENGTH=4;";

    {
        ovenList = setDataList(ovenList, oven1, oven2, oven3);
        laptopList = setDataList(laptopList, laptop1, laptop2, laptop3);
        refrigeratorList = setDataList(refrigeratorList, refrigerator1, refrigerator2, refrigerator3);
        vacuumCleanerList = setDataList(vacuumCleanerList, vacuumCleaner1, vacuumCleaner2, vacuumCleaner3);
        tabletPCList = setDataList(tabletPCList, tabletPC1, tabletPC2, tabletPC3);
        speakersList = setDataList(speakersList, speakers1, speakers2, speakers3);

        deviceList = new ArrayList<List<String>>(DEVICE_TYPE_NUM);
        deviceList.add(ovenList);
        deviceList.add(laptopList);
        deviceList.add(refrigeratorList);
        deviceList.add(vacuumCleanerList);
        deviceList.add(tabletPCList);
        deviceList.add(speakersList);
    }

    private List<String> setDataList(List<String> list, String device1, String device2, String device3) {
        final int LIST_SIZE = 3;
        list = new ArrayList<String>(LIST_SIZE);
        list.add(device1);
        list.add(device2);
        list.add(device3);
        return list;
    }

    public List<String> getOvenList() {
        return ovenList;
    }

    public List<String> getLaptopList() {
        return laptopList;
    }

    public List<String> getRefrigeratorList() {
        return refrigeratorList;
    }

    public List<String> getVacuumCleanerList() {
        return vacuumCleanerList;
    }

    public List<String> getTabletPCList() {
        return tabletPCList;
    }

    public List<String> getSpeakersList() {
        return speakersList;
    }

    public List<List<String>> getDeviceList() {
        return deviceList;
    }
}
