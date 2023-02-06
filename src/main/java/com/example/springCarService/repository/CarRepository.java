package com.example.springCarService.repository;

import com.example.springCarService.model.Car;

import java.util.*;

public class CarRepository {
    private Map<String, Car> carMap = new HashMap<>();

    public Map<String, Car> addCar(Car car) {
        String newID = UUID.randomUUID().toString();
        carMap.put(newID, car);
        return Map.of(newID, car);
    }

    public Map<String, Car> getCars() {
        return carMap;
    }

    public Optional<Car> deleteCar(String id) {
        Optional<Car> result = Optional.ofNullable(carMap.get(id));
        if (result.isPresent()) {
            carMap.remove(id);
        }
        return result;
    }

    public Optional<Car> editCar(String id, Car editedCar) {
        Optional<Car> result = Optional.ofNullable(carMap.get(id));
        if (result.isPresent()) {
            carMap.replace(id, editedCar);
            result = Optional.of(carMap.get(id));
        }
        return result;
    }
}
