package by.tc.task01.searcher;

import by.tc.task01.entity.criteria.Criteria;

import java.io.File;

public class DeviceSearcher {
    public <E> String search(File deviceFile, Criteria<E> criteria) {
        String foundInfo;
        if (criteria.getApplianceType() == null) {
            foundInfo = searchWithoutApplianceType(deviceFile, criteria);
        } else {
            foundInfo = searchWithApplianceType(deviceFile, criteria);
        }
        return foundInfo;
    }

    private <E> String searchWithoutApplianceType(File deviceFile, Criteria<E> criteria) {

    }

    private <E> String searchWithApplianceType(File deviceFile, Criteria<E> criteria) {

    }
}
