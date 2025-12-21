package com.example.autoverse.dto;

import java.math.BigDecimal;

public record VehicleDTO(String brand, String model, String category, String type, Integer year, BigDecimal price, String color,
                         String transmission, String fuelType, String carCondition, Integer engineCapacity, Integer kw, Long mileage,
                         Integer numberOfDoors, Integer previousOwners, String description, String imageUrl) {
}
