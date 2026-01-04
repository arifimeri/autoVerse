package com.example.autoverse.entity;

import com.example.autoverse.enums.MotorcycleType;
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
@Table(name = "motorcycles")
public class Motorcycle extends Vehicle{

    @Enumerated(EnumType.STRING)
    private MotorcycleType motorcycleType;

    private Integer engineCapacity;
    private Boolean abs;
}
