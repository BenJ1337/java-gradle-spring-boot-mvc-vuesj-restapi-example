package de.hackersolutions.webapp.service;

import de.hackersolutions.webapp.domain.Car;

import java.util.List;

public interface ICarService {
    /**
     * Gibt alle BMWs zurück
     * @return List<BMW>
     */
    List<Car> findAllCars();

    Car addCar(Car car);
}
