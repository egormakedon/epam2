package by.tc.task01.searcher;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.parser.DeviceParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DeviceSearcher {
    public <E> List<String> search(File deviceFile, Criteria<E> criteria) {
        List<String> criteriaList = createCriteriaList(criteria);
        return scanFile(deviceFile, criteriaList);
    }

    private <E> List<String> createCriteriaList(Criteria<E> criteria) {
        List<String> criteriaList = new ArrayList<String>();
        if (criteria.getApplianceType() != null) {
            final String APPLIANCE_TYPE = criteria.getApplianceType();
            final String APPLIANCE_TYPE_UPPER_CASE = APPLIANCE_TYPE.toUpperCase();
            criteriaList.add(APPLIANCE_TYPE_UPPER_CASE);
        }
        for (Map.Entry entry : criteria.getCriteria().entrySet()) {
            final String STRING = entry.getKey().toString() + "=" + entry.getValue().toString();
            final String STRING_UPPER_CASE = STRING.toUpperCase();
            criteriaList.add(STRING_UPPER_CASE);
        }
        return criteriaList;
    }

    private List<String> scanFile(File deviceFile, List<String> criteriaList) {
        List<String> foundDevice = null;
        Scanner sc = null;
        try {
            sc = new Scanner(deviceFile);
            while (sc.hasNextLine()) {
                final String DATA = sc.nextLine();
                final String DATA_UPPER_CASE = DATA.toUpperCase();

                DeviceParser deviceParser = new DeviceParser();
                List<String> dataList = deviceParser.parseDataFromFile(DATA_UPPER_CASE);

                if (isDataSatisfyCriteria(dataList, criteriaList)) {
                    foundDevice = dataList;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (sc != null) sc.close();
        }
        return foundDevice;
    }

    private boolean isDataSatisfyCriteria(List<String> dataList, List<String> criteriaList) {
        boolean result = true;
        for (String criteria : criteriaList) {
            if (!dataList.contains(criteria)) {
                result = false;
                break;
            }
        }
        return result;
    }
}