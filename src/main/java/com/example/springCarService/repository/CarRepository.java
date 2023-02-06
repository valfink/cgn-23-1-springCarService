package com.example.springCarService.repository;

import com.example.springCarService.model.Car;

import java.util.*;

public class CarRepository {
    private Map<String, Car> carMap = new HashMap<>();

    public void addCar(Car car) {
        carMap.put(UUID.randomUUID().toString(), car);
    }

    public Map<String, Car> getCars() {
        return carMap;
    }
}
