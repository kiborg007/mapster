package ch.ua.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.ua.dao.CoordinatesDAO;
import ch.ua.model.Coordinates;

@Service
public class CoordinatesServiceImpl implements CoordinatesService {

	private CoordinatesDAO coordinatesDAO;

	@Override
	@Transactional
	public void addCoordinate(Coordinates c) {

		this.coordinatesDAO.addCoordinate(c);
	}

	public void setCoordinatesDAO(CoordinatesDAO coordinatesDAO) {
		this.coordinatesDAO = coordinatesDAO;
	}

	@Override
	@Transactional
	public Coordinates getCoordinateById(int id) {

		return this.coordinatesDAO.getCoordinateById(id);
	}

	@Override
	@Transactional
	public Coordinates getCoordinateByPersonId(int id) {

		return this.coordinatesDAO.getCoordinateByPersonId(id);
	}

}
