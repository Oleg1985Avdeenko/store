package com.example.store.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class OrderDto {
    @OneToMany(mappedBy = "dtoSelectedCar", cascade = CascadeType.PERSIST)
    private Set<CarDto> dtoSelectedCars = new HashSet<>();

    private UserDto userDto;
}
