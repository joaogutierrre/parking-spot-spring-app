package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSportModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public ParkingSportModel save(ParkingSportModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
}
