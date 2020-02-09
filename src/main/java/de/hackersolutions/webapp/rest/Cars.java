package de.hackersolutions.webapp.rest;

import de.hackersolutions.webapp.domain.BMW;
import de.hackersolutions.webapp.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Cars {

    @Autowired
    ICarService carService;

    @GetMapping("/cars/bmw")
    public List<BMW> bmw(@RequestParam(value = "modelName", defaultValue = "-1") String modelName) {
        List<BMW> bmwList = carService.findAllCars();
        if("-1".equals(modelName)) {
            return bmwList;
        } else {
            bmwList.stream().filter(bmw -> bmw.getModelName().equals(modelName));
        }
        return bmwList;
    }

}
