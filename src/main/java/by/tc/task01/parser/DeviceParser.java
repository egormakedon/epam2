package by.tc.task01.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeviceParser {
    public List<String> parseDataFromFile(String dataString) {
        String[] splitDataString = dataString.split(" ");
        for (int index = 2; index < splitDataString.length; index++) {
            String string = splitDataString[index];
            splitDataString[index] = string.substring(0, string.length() - 1);
        }

        List<String> dataList = new ArrayList<String>(Arrays.asList(splitDataString));
        final String COLON = ":";
        dataList.remove(COLON);

        return dataList;
    }

    public List<String> parseDataForCreateObject(List<String> device) {
        List<String> listOfVar = new ArrayList<String>();
        device.remove(0);
        for (String deviceCharacter : device) {
            String[] splitDeviceCharacter = deviceCharacter.split("=");
            listOfVar.add(splitDeviceCharacter[1]);
        }

        return listOfVar;
    }
}
