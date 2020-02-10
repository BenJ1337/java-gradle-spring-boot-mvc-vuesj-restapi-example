package de.hackersolutions.webapp.domain.dao;

import de.hackersolutions.webapp.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDao extends CrudRepository<Car, Integer> {
}
