package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

class SpeakersCriteriaValidator {
    static <E> boolean validation(Map<E, Object> criteriaMap) {
        boolean result = true;
        for (Map.Entry entry : criteriaMap.entrySet()) {
            if (entry.getKey().equals(SearchCriteria.Speakers.POWER_CONSUMPTION)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS)) {
                Object object = entry.getValue();
                if (!ObjectTypeValidator.isInt(object)) {
                    result = false;
                    break;
                }
            } else if (entry.getKey().equals(SearchCriteria.Speakers.CORD_LENGTH)) {
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
