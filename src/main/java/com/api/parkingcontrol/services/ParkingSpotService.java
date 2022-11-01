package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositores.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service // Classe específica de serviços bean do SpringBoot
public class ParkingSpotService {


    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
