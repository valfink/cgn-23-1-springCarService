package com.example.springCarService.controller;

import com.example.springCarService.model.Car;
import com.example.springCarService.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarController {
    private CarService carService = new CarService();
    @PostMapping("car/new")
    public Car postNewCar(@RequestBody Car car) {
        carService.addCar(car);
        return car;
        // lame, should get the new car directly from the service!
    }

    @GetMapping("cars")
    public Map<String, Car> getAllCars() {
        return carService.getCars();
    }

    @DeleteMapping("car/{id}")
    public Car deleteCar(@PathVariable String id) {
        Optional<Car> deletedCar = carService.deleteCar(id);
        return deletedCar.orElse(null);
        //return deletedCar.orElseThrow();
    }
}
