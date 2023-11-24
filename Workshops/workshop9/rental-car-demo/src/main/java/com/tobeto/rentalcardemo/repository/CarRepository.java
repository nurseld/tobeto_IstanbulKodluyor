package com.tobeto.rentalcardemo.repository;

import com.tobeto.rentalcardemo.entity.Car;
import com.tobeto.rentalcardemo.services.dto.car.responses.GetAllCarResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository <Car,Integer>{

    @Query("Select new com.tobeto.rentalcardemo.services.dto.car.responses.GetAllCarResponse(c.brandName,c.modelName,c.modelYear,c.fuelType,c.gearType,c.dailyPrice)" +
            " FROM Car c WHERE c.modelYear = :modelYear")
    List<GetAllCarResponse> findModelYear(String modelYear);
    List<Car> findByModelName(String modelName);
}
