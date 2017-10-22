package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

class VacuumCleanerCriteriaValidator {
    static <E> boolean validation(Map<E, Object> criteriaMap) {
        boolean result = true;
        for (Map.Entry entry : criteriaMap.entrySet()) {
            if (entry.getKey().equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH)) {
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
