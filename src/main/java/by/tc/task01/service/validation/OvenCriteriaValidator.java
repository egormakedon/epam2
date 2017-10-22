package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

class OvenCriteriaValidator {
    static <E> boolean validation(Map<E, Object> criteriaMap) {
        boolean result = true;
        for (Map.Entry entry : criteriaMap.entrySet()) {
            if (entry.getKey().equals(SearchCriteria.Oven.POWER_CONSUMPTION)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Oven.WEIGHT)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Oven.CAPACITY)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Oven.DEPTH)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Oven.HEIGHT)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isDouble(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Oven.WIDTH)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isDouble(object)) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
