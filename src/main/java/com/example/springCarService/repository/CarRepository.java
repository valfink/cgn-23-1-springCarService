package com.example.springCarService.repository;

import com.example.springCarService.model.Car;

import java.util.*;

public class CarRepository {
    private Map<UUID, Car> carMap = new HashMap<>();

    public void addCar(Car car) {
        carMap.put(UUID.fromString(car.toString()), car);
    }

    public Map<UUID, Car> getCars() {
        return carMap;
    }
}
