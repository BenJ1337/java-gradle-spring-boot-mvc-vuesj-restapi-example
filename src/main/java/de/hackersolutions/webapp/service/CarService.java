package de.hackersolutions.webapp.service;

import de.hackersolutions.webapp.domain.BMW;
import de.hackersolutions.webapp.domain.repository.CarRepositiory;

import java.util.List;

public class CarService implements ICarService {

    CarRepositiory carRepositiory = new CarRepositiory();

    @Override
    public List<BMW> findAllCars() {
        return carRepositiory.findAllBMW();
    }
}
