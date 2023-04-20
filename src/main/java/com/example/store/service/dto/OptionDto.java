package com.example.store.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class OptionDto {

    private String optionName;

    private String salon;

    private Boolean heatedSeat;

    private Boolean cruiseControl;

    private Boolean steeringWheelControl;

    private Boolean fogLight;

    private Set<CarDto> selectedOptions = new HashSet<>();
}
