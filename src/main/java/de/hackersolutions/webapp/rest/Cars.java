package de.hackersolutions.webapp.rest;

import de.hackersolutions.webapp.domain.Car;
import de.hackersolutions.webapp.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Cars {

    @Autowired
    ICarService carService;

    @GetMapping("/cars/bmw")
    public List<Car> bmw(@RequestParam(value = "modelName", defaultValue = "-1") String modelName) {
        List<Car> carList = carService.findAllCars();
        if("-1".equals(modelName)) {
            return carList;
        } else {
            carList.stream().filter(car -> car.getModelName().equals(modelName));
        }
        return carList;
    }

    @PostMapping(path = "/cars/bmw", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Car addBmw(@RequestBody Car newCar) {

        carService.addCar(newCar);

        return newCar;
    }

}
