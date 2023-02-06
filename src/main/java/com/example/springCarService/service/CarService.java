package com.example.springCarService.service;

import com.example.springCarService.model.Car;
import com.example.springCarService.repository.CarRepository;

import java.util.List;

public class CarService {
    private CarRepository carRepository = new CarRepository();

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public List<Car> getCars() {
        return carRepository.getCars();
    }
}
