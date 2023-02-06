package com.example.springCarService.service;

import com.example.springCarService.model.Car;
import com.example.springCarService.repository.CarRepository;

import java.util.Map;

public class CarService {
    private CarRepository carRepository = new CarRepository();

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public Map<String, Car> getCars() {
        return carRepository.getCars();
    }
}
