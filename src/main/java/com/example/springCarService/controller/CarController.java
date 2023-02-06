package com.example.springCarService.controller;

import com.example.springCarService.model.Car;
import com.example.springCarService.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class CarController {
    private CarService carService;
    @PostMapping("car/new")
    public Map<String, Car> postNewCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    @GetMapping("cars")
    public Map<String, Car> getAllCars() {
        return carService.getCars();
    }

    @DeleteMapping("car/{id}")
    public Car deleteCar(@PathVariable String id) {
        Optional<Car> deletedCar = carService.deleteCar(id);
        return deletedCar.orElseThrow(NoSuchElementException::new);
    }

    @PutMapping("car/{id}")
    public Car editCar(@PathVariable String id, @RequestBody Car editedCar) {
        Optional<Car> returnCar = carService.editCar(id, editedCar);
        return returnCar.orElseThrow(NoSuchElementException::new);
    }
}
