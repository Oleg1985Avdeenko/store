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
public class Transmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String type;

    @OneToMany(mappedBy = "carTransmission", cascade = CascadeType.PERSIST)
    private Set<Car> selectedTransmissions = new HashSet<>();

}
