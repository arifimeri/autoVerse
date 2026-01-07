    package com.example.autoverse.entity;

    import com.example.autoverse.enums.VehicleCategory;
    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.Setter;

    import java.util.List;

    @Entity
    @Table(name = "vehicle_models")
    @Getter
    @Setter

    public class VehicleModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable=false)
        private String name;

        @Enumerated(EnumType.STRING)
        private VehicleCategory vehicleCategory;

        @ManyToOne
        @JoinColumn(name="brand_id", nullable=false)
        private Brand brand;

        @OneToMany(mappedBy = "model")
        private List<Vehicle> vehicles;
    }
