package com.example.autoverse.entity;

import com.example.autoverse.enums.MotorcycleType;
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
@Table(name = "motorcycles")
public class Motorcycle extends Vehicle{

    @Enumerated(EnumType.STRING)
    private MotorcycleType motorcycleType;

    @Column(name="engine_capacity", nullable=false)
    @Min(50)
    private Integer engineCapacity;

    private Boolean abs;
}
