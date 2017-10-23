package by.tc.task01.searcher;

import by.tc.task01.entity.criteria.Criteria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DeviceSearcher {
    public <E> String search(File deviceFile, Criteria<E> criteria) {
        List<String> criteriaList = createCriteriaList(criteria);
        return scanFile(deviceFile, criteriaList);
    }

    private <E> List<String> createCriteriaList(Criteria<E> criteria) {
        List<String> criteriaList = new ArrayList<String>();
        if (criteria.getApplianceType() != null) {
            criteriaList.add(criteria.getApplianceType());
        }
        for (Map.Entry entry : criteria.getCriteria().entrySet()) {
            final String STRING = entry.getKey().toString() + "=" + entry.getValue().toString();
            criteriaList.add(STRING);
        }
        return criteriaList;
    }

    private String scanFile(File deviceFile, List<String> criteriaList) {
        String foundDevice = null;
        Scanner sc = null;
        try {
            sc = new Scanner(deviceFile);
            while (sc.hasNextLine()) {
                final String DATA = sc.nextLine();
                if (isDataSatisfyCriteria(DATA, criteriaList)) {
                    foundDevice = DATA;
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

    private boolean isDataSatisfyCriteria(final String DATA, List<String> criteriaList) {
        boolean result = true;
        for (String criteria : criteriaList) {
            if (!DATA.contains(criteria)) {
                result = false;
                break;
            }
        }
        return result;
    }
}