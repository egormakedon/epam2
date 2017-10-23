package by.tc.task01.creator;

import by.tc.task01.entity.*;
import by.tc.task01.parser.DeviceParser;

import java.util.List;

public class ObjectCreator {
    public Appliance createObject(List<String> device) {
        Appliance appliance;
        final String APPLIANCE_TYPE = device.get(0);

        DeviceParser deviceParser = new DeviceParser();
        List<String> listOfVar = deviceParser.parseDataForCreateObject(device);

        switch (APPLIANCE_TYPE) {
            case "OVEN":
                appliance = createOven(listOfVar);
                break;
            case "LAPTOP":
                appliance = createLaptop(listOfVar);
                break;
            case "REFRIGERATOR":
                appliance = createRefrigerator(listOfVar);
                break;
            case "VACUUMCLEANER":
                appliance = createVacuumCleaner(listOfVar);
                break;
            case "TABLETPC":
                appliance = createTabletPC(listOfVar);
                break;
            case "SPEAKERS":
                appliance = createSpeakers(listOfVar);
                break;
            default:
                appliance = null;
                break;
        }
        return appliance;
    }

    private Oven createOven(List<String> listOfVar) {
        final int POWER_CONSUMPTION = Integer.parseInt(listOfVar.get(0));
        final int WEIGHT = Integer.parseInt(listOfVar.get(1));
        final int CAPACITY = Integer.parseInt(listOfVar.get(2));
        final int DEPTH = Integer.parseInt(listOfVar.get(3));
        final double HEIGHT = Double.parseDouble(listOfVar.get(4));
        final double WIDTH = Double.parseDouble(listOfVar.get(5));
        return new Oven(POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH);
    }

    private Laptop createLaptop(List<String> listOfVar) {
        final double BATTERY_CAPACITY = Double.parseDouble(listOfVar.get(0));
        final String OS = listOfVar.get(1);
        final int MEMORY_ROM = Integer.parseInt(listOfVar.get(2));
        final int SYSTEM_MEMORY = Integer.parseInt(listOfVar.get(3));
        final double CPU = Double.parseDouble(listOfVar.get(4));
        final int DISPLAY_INCHES = Integer.parseInt(listOfVar.get(5));
        return new Laptop(BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHES);
    }

    private Refrigerator createRefrigerator(List<String> listOfVar) {
        final int POWER_CONSUMPTION = Integer.parseInt(listOfVar.get(0));
        final int WEIGHT = Integer.parseInt(listOfVar.get(1));
        final int FREEZER_CAPACITY = Integer.parseInt(listOfVar.get(2));
        final double OVERALL_CAPACITY = Double.parseDouble(listOfVar.get(3));
        final int HEIGHT = Integer.parseInt(listOfVar.get(4));
        final int WIDTH = Integer.parseInt(listOfVar.get(5));
        return new Refrigerator(POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH);
    }

    private VacuumCleaner createVacuumCleaner(List<String> listOfVar) {
        final int POWER_CONSUMPTION = Integer.parseInt(listOfVar.get(0));
        final String FILTER_TYPE = listOfVar.get(1);
        final String BAG_TYPE = listOfVar.get(2);
        final String WAND_TYPE = listOfVar.get(3);
        final int MOTOR_SPEED_REGULATION = Integer.parseInt(listOfVar.get(4));
        final int CLEANING_WIDTH = Integer.parseInt(listOfVar.get(5));
        return new VacuumCleaner(POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH);
    }

    private TabletPC createTabletPC(List<String> listOfVar) {
        final int BATTERY_CAPACITY = Integer.parseInt(listOfVar.get(0));
        final int DISPLAY_INCHES = Integer.parseInt(listOfVar.get(1));
        final int MEMORY_ROM = Integer.parseInt(listOfVar.get(2));
        final int FLASH_MEMORY_CAPACITY = Integer.parseInt(listOfVar.get(3));
        final String COLOR = listOfVar.get(4);
        return new TabletPC(BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR);
    }

    private Speakers createSpeakers(List<String> listOfVar) {
        final int POWER_CONSUMPTION = Integer.parseInt(listOfVar.get(0));
        final int NUMBER_OF_SPEAKERS = Integer.parseInt(listOfVar.get(1));
        final String FREQUENCY_RANGE = listOfVar.get(2);
        final int CORD_LENGTH = Integer.parseInt(listOfVar.get(3));
        return new Speakers(POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH);
    }
}
