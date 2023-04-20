package com.example.store.entity.cars;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table
public class ModelOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String optionName;

    @Column
    private String salon;

    @Column
    private Boolean heatedSeat;

    @Column
    private Boolean cruiseControl;

    @Column
    private Boolean steeringWheelControl;

    @Column
    private Boolean fogLight;

    @OneToMany(mappedBy = "carOption", cascade = CascadeType.PERSIST)
    private Set<Car> selectedOptions = new HashSet<>();

}
