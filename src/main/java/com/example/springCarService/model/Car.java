package com.example.springCarService.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
    private String brand;
    private int numberOfTires;
    private boolean hasInspectionCertificate;
}
