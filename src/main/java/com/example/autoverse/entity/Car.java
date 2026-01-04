package com.example.autoverse.entity;

import com.example.autoverse.enums.CarBodyType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
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

    private Integer numberOfDoors;
    private Integer engineCapacity;
    private Integer kw;
    private Boolean foldingMirror;
}
