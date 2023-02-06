package com.example.springCarService.repository;

import com.example.springCarService.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> carList = new ArrayList<>();

    public void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> getCars() {
        return carList;
    }
}
