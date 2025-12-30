package com.example.autoverse.dto;
import com.example.autoverse.enums.CarBodyType;

public record CarDTO (VehicleDTO vehicle, CarBodyType bodyType, Integer numberOfDoors, Integer engineCapacity, Integer kw) {
}
