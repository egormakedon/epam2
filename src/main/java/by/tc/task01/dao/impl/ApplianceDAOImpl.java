package by.tc.task01.dao.impl;

import by.tc.task01.creator.ObjectCreator;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.creator.FileCreator;
import by.tc.task01.searcher.DeviceSearcher;

import java.io.File;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		FileCreator fileCreator = new FileCreator();
		File deviceFile = fileCreator.createFile();

		DeviceSearcher deviceSearcher = new DeviceSearcher();
		List<String> foundDevice = deviceSearcher.search(deviceFile, criteria);

		if (foundDevice == null) return null;

		ObjectCreator objectCreator = new ObjectCreator();
		return objectCreator.createObject(foundDevice);
	}
}