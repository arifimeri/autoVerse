package com.example.autoverse.dto;

import com.example.autoverse.enums.TruckType;

public record TruckDTO(VehicleDTO vehicle, TruckType type, Double loadCapacity, Integer axles) {
}
