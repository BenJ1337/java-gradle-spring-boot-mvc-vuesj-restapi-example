package de.hackersolutions.webapp.service;

import de.hackersolutions.webapp.domain.Car;
import de.hackersolutions.webapp.domain.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CarService implements ICarService {

    private static Logger logger = Logger.getLogger(String.valueOf(CarService.class));

    @Autowired
    CarDao carDao;

    public CarService() {
    }

    @Override
    public List<Car> findAllCars() {
        logger.info("findAllCars()");
        List<Car> list = new ArrayList<>();

        Iterable<Car> it = carDao.findAll();
        it.iterator().forEachRemaining(list::add);

        return list;
    }

    @Override
    public Car addCar(Car car) {
        logger.info("addCar(Car car)");
        return carDao.save(car);
    }
}
