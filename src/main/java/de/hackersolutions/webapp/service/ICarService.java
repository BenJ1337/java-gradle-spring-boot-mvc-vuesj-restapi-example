package de.hackersolutions.webapp.service;

import de.hackersolutions.webapp.domain.BMW;

import java.util.List;

public interface ICarService {
    /**
     * Gibt alle BMWs zurück
     * @return List<BMW>
     */
    List<BMW> findAllCars();
}
