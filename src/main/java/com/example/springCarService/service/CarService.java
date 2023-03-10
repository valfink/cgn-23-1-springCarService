package com.example.springCarService.service;

import com.example.springCarService.model.Car;
import com.example.springCarService.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CarService {
    private CarRepository carRepository;

    public Map<String, Car> addCar(Car car) {
        return carRepository.addCar(car);
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
