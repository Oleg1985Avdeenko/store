package com.example.store.entity.cars;

import lombok.*;
import org.springframework.data.annotation.Id;

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
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String colorName;

    @OneToMany(mappedBy = "carColor", cascade = CascadeType.PERSIST)
    private Set<Car> selectedColors = new HashSet<>();

}
