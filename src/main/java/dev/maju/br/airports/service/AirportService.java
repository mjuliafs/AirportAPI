/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.maju.br.airports.service;

import dev.maju.br.airports.entities.Airport;
import dev.maju.br.airports.repositories.AirportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesidevb
 */

@Service
public class AirportService {
    
    @Autowired
    private AirportRepository airportRepository;
    
    public List<Airport> findAll() {
        
        List<Airport> result = airportRepository.findAll();
        return result;
    }
    
    /**
         * Retorna DTO Airports filtrado por cidade.
         * @param city
         * @return
         */
        public List<Airport> findByCity(String city) {
            List<Airport> result = airportRepository.findByCityIgnoreCase(city);
            return result;
        }
}


