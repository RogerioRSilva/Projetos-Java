package com.api.parkingcontrol.repositores;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
            //Extendo o pacote JPARepository (Possui varios metodos prontos para acessar o banco CRUD)
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
