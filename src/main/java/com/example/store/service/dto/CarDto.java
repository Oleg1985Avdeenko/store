package com.example.store.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class CarDto {

    private BigDecimal price;

    private Boolean availability;

    private String model;

    private OrderDto dtoSelectedCar;

    private EngineDto carEngine;

    private ColorDto carColor;

    private TransmissionDto carTransmission;

    private OptionDto carOption;

}
