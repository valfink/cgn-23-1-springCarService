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
            carMap.put(id, editedCar);
            result = Optional.of(carMap.get(id));
        }
        return result;
    }
}
