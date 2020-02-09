package de.hackersolutions.webapp.service.config;

import de.hackersolutions.webapp.service.CarService;
import de.hackersolutions.webapp.service.ICarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {
    @Bean
    ICarService carService() {
        return new CarService();
    }
}
