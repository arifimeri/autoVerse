package com.example.autoverse.entity;

import com.example.autoverse.enums.CarBodyType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cars")
public class Car extends Vehicle{

    @Enumerated(EnumType.STRING)
    private CarBodyType bodyType;

    @Min(1)
    private Integer numberOfDoors;

    @Column(name = "engine_capacity", nullable = false)
    @Min(1)
    private Integer engineCapacity;

    @Column(nullable = false)
    private Integer kw;
}
