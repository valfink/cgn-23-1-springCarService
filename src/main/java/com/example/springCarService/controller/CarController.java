package com.example.springCarService.controller;

import com.example.springCarService.model.Car;
import com.example.springCarService.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
}
