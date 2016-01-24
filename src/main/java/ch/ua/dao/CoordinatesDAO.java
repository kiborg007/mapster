package ch.ua.dao;

import ch.ua.model.Coordinates;

public interface CoordinatesDAO {

	public void addCoordinate(Coordinates c);

	public Coordinates getCoordinateById(int id);

	public Coordinates getCoordinateByPersonId(int id);
}
