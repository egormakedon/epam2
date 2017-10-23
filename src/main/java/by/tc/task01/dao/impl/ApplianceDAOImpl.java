package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.filecreator.FileCreator;
import by.tc.task01.searcher.DeviceSearcher;

import java.io.File;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		FileCreator fileCreator = new FileCreator();
		File deviceFile = fileCreator.createFile();

		DeviceSearcher deviceSearcher = new DeviceSearcher();
		String foundInfo = deviceSearcher.search(deviceFile, criteria);

		if (foundInfo == null) return null;

		return null;///
	}
}