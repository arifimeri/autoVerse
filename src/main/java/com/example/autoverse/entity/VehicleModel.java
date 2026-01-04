package com.example.autoverse.entity;

import com.example.autoverse.enums.VehicleCategory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vehicle_models")
@Getter
@Setter

public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private VehicleCategory vehicleCategory;

    @ManyToOne
    private Brand brand;
}
