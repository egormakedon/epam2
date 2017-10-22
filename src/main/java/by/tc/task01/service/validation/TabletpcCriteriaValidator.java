package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

class TabletpcCriteriaValidator {
    static <E> boolean validation(Map<E, Object> criteriaMap) {
        boolean result = true;
        for (Map.Entry entry : criteriaMap.entrySet()) {
            if (entry.getKey().equals(SearchCriteria.TabletPC.BATTERY_CAPACITY)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.TabletPC.DISPLAY_INCHES)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.TabletPC.MEMORY_ROM)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY)) {
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
