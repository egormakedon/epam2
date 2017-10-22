package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

class LaptopCriteriaValidator {
    static <E> boolean validation(Map<E, Object> criteriaMap) {
        boolean result = true;
        for (Map.Entry entry : criteriaMap.entrySet()) {
            if (entry.getKey().equals(SearchCriteria.Laptop.BATTERY_CAPACITY)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isDouble(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Laptop.MEMORY_ROM)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Laptop.SYSTEM_MEMORY)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Laptop.CPU)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isDouble(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Laptop.DISPLAY_INCHES)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
