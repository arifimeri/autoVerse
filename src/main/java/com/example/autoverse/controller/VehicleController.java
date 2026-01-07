package com.example.autoverse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @GetMapping
    public String getAllVehicles(){
        return "Vehicles";
    }
    @GetMapping("/brand/{brand}")
    public String getVehicleBrand(@PathVariable String brand) {
        return "The vehicle brand is " + brand;
    }

    @GetMapping("/model/{model}")
    public String getVehicleModel(@PathVariable String model){
        return "The vehicle model is " + model;
    }

    @GetMapping("/year/{year}")
    public String getVehicleYear(@PathVariable Integer year) {
        return "The vehicle year is " + year;
    }

    @GetMapping("/type/{type}")
    public String getVehicleType(@PathVariable String type) {
        return "The vehicle type is " + type;
    }

//    @PostMapping("/vehicle")
//    public VehicleDTO createVehicle(@RequestBody VehicleDTO vehicle) {
//        return vehicle;
//    }
}
