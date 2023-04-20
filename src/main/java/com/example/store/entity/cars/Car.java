package com.example.store.entity.cars;

import com.example.store.entity.users.ClientOrder;

import lombok.*;
import org.springframework.data.annotation.Id;


import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column
    private String model;

    @Column
    private BigDecimal price;

    @Column
    private Boolean availability;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "engine_id", nullable = false)
    private Engine carEngine;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "color_id", nullable = false)
    private Color carColor;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "transmission_id", nullable = false)
    private Transmission carTransmission;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "model_option_id", nullable = false)
    private ModelOption carOption;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "order_id", nullable = false)
    private ClientOrder selectedCar;

}
