package ch.ua.engine;

import java.util.HashMap;

import org.apache.log4j.Logger;

import ch.ua.model.Coordinates;
import ch.ua.service.CoordinatesService;

public class Engine {

	private Logger logger = Logger.getLogger(Engine.class);
	private HashMap<Integer, Coordinates> hash = new HashMap<Integer, Coordinates>();
	private CoordinatesService coordinatesService;

	Engine() {

	}

	public synchronized void put(Coordinates coord) {

		HashMap<Integer, Coordinates> map = getHash();
		if (!map.containsKey(coord.getPerson().getPersonID())) {
			map.put(coord.getPerson().getPersonID(), coord);
		} else {
			Integer id = coord.getPerson().getPersonID();
			Coordinates c = map.get(id);
			coordinatesService.addCoordinate(c);

			map.replace(id, coord);

			/*
			 * map.remove(id, c); map.put(id, coord);
			 */
		}
	}

	public Coordinates get(Integer id) {
		if (hash.containsKey(id)) {
			return hash.get(id);
		} else {
			Coordinates coord = coordinatesService.getCoordinateByPersonId(id);
			hash.put(id, coord);
			return coord;
		}
	}

	public HashMap<Integer, Coordinates> getHash() {
		return this.hash;
	}

	public void setCoordinatesService(CoordinatesService coordinatesService) {
		this.coordinatesService = coordinatesService;
	}

}
