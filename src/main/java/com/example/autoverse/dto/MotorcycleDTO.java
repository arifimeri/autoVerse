package com.example.autoverse.dto;

import com.example.autoverse.enums.MotorcycleType;

public record MotorcycleDTO(VehicleDTO vehicle, MotorcycleType type, Integer engineCapacity, Boolean abs) {
}
