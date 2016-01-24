package ch.ua.service;

import ch.ua.model.Coordinates;

public interface CoordinatesService {

	public void addCoordinate(Coordinates c);

	public Coordinates getCoordinateById(int id);

	public Coordinates getCoordinateByPersonId(int id);
}
