package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		final String APPLIANCE_TYPE = criteria.getApplianceType();
		boolean applianceTypeResult = checkApplianceType(APPLIANCE_TYPE);

		Map<E, Object> criteriaMap = criteria.getCriteria();
		boolean criteriaMapResult = checkCriteriaMap(criteriaMap);

		return applianceTypeResult && criteriaMapResult;
	}

	private static boolean checkApplianceType(final String APPLIANCE_TYPE) {
		boolean result;
		if (isApplianceTypeNull(APPLIANCE_TYPE)) {
			result = true;
		} else {
			switch (APPLIANCE_TYPE.toUpperCase()) {
				case "OVEN":
					result = true;
					break;
				case "LAPTOP":
					result = true;
					break;
				case "REFRIGERATOR":
					result = true;
					break;
				case "VACUUMCLEANER":
					result = true;
					break;
				case "TABLETPC":
					result = true;
					break;
				case "SPEAKERS":
					result = true;
					break;
				default:
					result = false;
					break;
			}
		}
		return result;
	}

	private static boolean isApplianceTypeNull(final String APPLIANCE_TYPE) {
		return APPLIANCE_TYPE == null ? true : false;
	}

	private static <E> boolean checkCriteriaMap(Map<E, Object> criteriaMap) {
		boolean result;
		if (!criteriaMap.isEmpty()) {
			 result = validationCriteria(criteriaMap);
		} else {
			result = false;
		}
		return result;
	}

	private static <E> boolean validationCriteria(Map<E, Object> criteriaMap) {
		boolean result;
		switch (criteriaMap.keySet().getClass().getSimpleName()) {
			case "Oven":
				result = validationOven(criteriaMap);
				break;
			case "Laptop":
				result = validationLaptop(criteriaMap);
				break;
			case "Refrigerator":
				result = validationRefrigerator(criteriaMap);
				break;
			case "VacuumCleaner":
				result = validationVacuumCleaner(criteriaMap);
				break;
			case "TabletPC":
				result = validationTabletPC(criteriaMap);
				break;
			case "Speakers":
				result = validationSpeakers(criteriaMap);
				break;
			default:
				result = false;
				break;
		}
		return result;
	}

	private static <E> boolean validationOven(Map<E, Object> criteriaMap) {

	}

	private static <E> boolean validationLaptop(Map<E, Object> criteriaMap) {

	}

	private static <E> boolean validationRefrigerator(Map<E, Object> criteriaMap) {

	}

	private static <E> boolean validationVacuumCleaner(Map<E, Object> criteriaMap) {

	}

	private static <E> boolean validationTabletPC(Map<E, Object> criteriaMap) {

	}

	private static <E> boolean validationSpeakers(Map<E, Object> criteriaMap) {

	}
}