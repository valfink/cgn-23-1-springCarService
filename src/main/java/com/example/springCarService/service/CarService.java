package com.example.springCarService.service;

import com.example.springCarService.model.Car;
import com.example.springCarService.repository.CarRepository;

import java.util.Map;
import java.util.Optional;

public class CarService {
    private CarRepository carRepository = new CarRepository();

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public Map<String, Car> getCars() {
        return carRepository.getCars();
    }

    public Optional<Car> deleteCar(String id) {
        return carRepository.deleteCar(id);
    }

    public Optional<Car> editCar(String id, Car editedCar) {
        return carRepository.editCar(id, editedCar);
    }
}
