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
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private Double volume;

    @Column
    private String type;

    @OneToMany(mappedBy = "carEngine", cascade = CascadeType.PERSIST)
    private Set<Car> selectedEngines = new HashSet<>();

}
