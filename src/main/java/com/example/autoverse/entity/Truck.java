package com.example.autoverse.entity;

import com.example.autoverse.enums.TruckType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "trucks")
public class Truck extends Vehicle{

    @Enumerated(EnumType.STRING)
    private TruckType truckType;

    private Double loadCapacity;
    private Integer axles;
}
