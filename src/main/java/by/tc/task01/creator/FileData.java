package by.tc.task01.creator;

import java.util.ArrayList;
import java.util.List;

class FileData {
    private List<List<String>> deviceList;
    private List<String> ovenList;
    private List<String> laptopList;
    private List<String> refrigeratorList;
    private List<String> vacuumCleanerList;
    private List<String> tabletPCList;
    private List<String> speakersList;

    {
        final String OVEN_1 = "Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5;";
        final String OVEN_2 = "Oven : POWER_CONSUMPTION=1500, WEIGHT=12, CAPACITY=33, DEPTH=60, HEIGHT=45, WIDTH=68;";
        final String OVEN_3 = "Oven : POWER_CONSUMPTION=2000, WEIGHT=11, CAPACITY=33, DEPTH=60, HEIGHT=40, WIDTH=70;";

        final String LAPTOP_1 = "Laptop : BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHES=18;";
        final String LAPTOP_2 = "Laptop : BATTERY_CAPACITY=1.5, OS=Linux, MEMORY_ROM=8000, SYSTEM_MEMORY=1000, CPU=2.2, DISPLAY_INCHES=19;";
        final String LAPTOP_3 = "Laptop : BATTERY_CAPACITY=3, OS=Windows, MEMORY_ROM=8000, SYSTEM_MEMORY=1500, CPU=3.2, DISPLAY_INCHES=22;";

        final String REFRIGERATOR_1 = "Refrigerator : POWER_CONSUMPTION=100, WEIGHT=20, FREEZER_CAPACITY=10, OVERALL_CAPACITY=300, HEIGHT=200, WIDTH=70;";
        final String REFRIGERATOR_2 = "Refrigerator : POWER_CONSUMPTION=200, WEIGHT=30, FREEZER_CAPACITY=15, OVERALL_CAPACITY=300, HEIGHT=180, WIDTH=80;";
        final String REFRIGERATOR_3 = "Refrigerator : POWER_CONSUMPTION=150, WEIGHT=35, FREEZER_CAPACITY=20, OVERALL_CAPACITY=350.5, HEIGHT=250, WIDTH=75;";

        final String VACUUM_CLEANER_1 = "VacuumCleaner : POWER_CONSUMPTION=100, FILTER_TYPE=A, BAG_TYPE=A2, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=3000, CLEANING_WIDTH=20;";
        final String VACUUM_CLEANER_2 = "VacuumCleaner : POWER_CONSUMPTION=110, FILTER_TYPE=B, BAG_TYPE=AA-89, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=2900, CLEANING_WIDTH=25;";
        final String VACUUM_CLEANER_3 = "VacuumCleaner : POWER_CONSUMPTION=90, FILTER_TYPE=C, BAG_TYPE=XX00, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=2950, CLEANING_WIDTH=30;";

        final String TABLET_PC_1 = "TabletPC : BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=2, COLOR=blue;";
        final String TABLET_PC_2 = "TabletPC : BATTERY_CAPACITY=4, DISPLAY_INCHES=15, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=6, COLOR=red;";
        final String TABLET_PC_3 = "TabletPC : BATTERY_CAPACITY=5, DISPLAY_INCHES=16, MEMORY_ROM=16000, FLASH_MEMORY_CAPACITY=8, COLOR=green;";

        final String SPEAKERS_1 = "Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2;";
        final String SPEAKERS_2 = "Speakers : POWER_CONSUMPTION=20, NUMBER_OF_SPEAKERS=3, FREQUENCY_RANGE=3-4, CORD_LENGTH=3;";
        final String SPEAKERS_3 = "Speakers : POWER_CONSUMPTION=17, NUMBER_OF_SPEAKERS=4, FREQUENCY_RANGE=2-3.5, CORD_LENGTH=4;";

        ovenList = setDataList(ovenList, OVEN_1, OVEN_2, OVEN_3);
        laptopList = setDataList(laptopList, LAPTOP_1, LAPTOP_2, LAPTOP_3);
        refrigeratorList = setDataList(refrigeratorList, REFRIGERATOR_1, REFRIGERATOR_2, REFRIGERATOR_3);
        vacuumCleanerList = setDataList(vacuumCleanerList, VACUUM_CLEANER_1, VACUUM_CLEANER_2, VACUUM_CLEANER_3);
        tabletPCList = setDataList(tabletPCList, TABLET_PC_1, TABLET_PC_2, TABLET_PC_3);
        speakersList = setDataList(speakersList, SPEAKERS_1, SPEAKERS_2, SPEAKERS_3);
    }


    {
        final int DEVICE_TYPE_COUNT = 6;
        deviceList = new ArrayList<List<String>>(DEVICE_TYPE_COUNT);
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

    List<List<String>> getDeviceList() {
        return deviceList;
    }
}
