package com.example.autoverse.dto;

import com.example.autoverse.enums.*;

import java.math.BigDecimal;
import java.util.List;

public record VehicleDTO(String brand, String model, VehicleCategory category, Integer year, BigDecimal price, String color, TransmissionType transmission,
                         FuelType fuelType, VehicleCondition condition, Long mileage, Integer previousOwners, String description, List<String> images, VehicleStatus status) {
}
