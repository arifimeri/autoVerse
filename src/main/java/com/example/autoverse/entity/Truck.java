package com.example.autoverse.entity;

import com.example.autoverse.enums.TruckType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
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

    @Column(name = "load_capacity", nullable = false)
    private Double loadCapacity;

    @Min(1)
    @Column(nullable = false)
    private Integer axles;
}
