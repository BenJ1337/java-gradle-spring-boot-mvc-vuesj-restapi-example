package de.hackersolutions.webapp.web;

import de.hackersolutions.webapp.domain.Car;
import de.hackersolutions.webapp.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarPage {

    @Autowired
    ICarService carService;

    @GetMapping("/cars")
    String cars() {
        return "cars";
    }

    @PostMapping(path = "/cars/add", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Car carsAdd(@RequestBody Car newCar) {
        return carService.addCar(newCar);
    }
}
