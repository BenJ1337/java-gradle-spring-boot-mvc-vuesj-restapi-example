package de.hackersolutions.webapp.domain.repository;

import de.hackersolutions.webapp.domain.BMW;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarRepositiory {

    List<BMW> bmwList = Stream.of(
            new BMW(4, "Black", "i8"),
            new BMW(4, "White", "X3"),
            new BMW(4, "Blue Metallic", "Z4")
    ).collect(Collectors.toList());

    public List<BMW> findAllBMW() {
        return bmwList;
    }
}
