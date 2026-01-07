package com.example.autoverse.entity;

import com.example.autoverse.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "vehicles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "model_id", nullable = false)
    private VehicleModel model;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VehicleImage> images;

    private Integer year;
    private Integer mileage;
    private BigDecimal price;
    private String color;

    @Enumerated(EnumType.STRING)
    private VehicleCategory vehicleCategory;

    @Enumerated(EnumType.STRING)
    private TransmissionType transmissionType;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    @Enumerated(EnumType.STRING)
    private VehicleCondition vehicleCondition;

    @Enumerated(EnumType.STRING)
    private VehicleStatus vehicleStatus;

    @Enumerated(EnumType.STRING)
    private ServiceStatus serviceStatus;

    private String description;

}
