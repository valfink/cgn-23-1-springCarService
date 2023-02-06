package com.example.springCarService.controller;

import com.example.springCarService.model.Car;
import com.example.springCarService.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarController {
    private CarService carService = new CarService();
    @PostMapping("car/new")
    public Car postNewCar(@RequestBody Car car) {
        carService.addCar(car);
        return car;
        // lame, should get the new car directly from the service including the uuid!
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
