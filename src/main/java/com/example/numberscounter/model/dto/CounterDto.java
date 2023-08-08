package com.example.numberscounter.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CounterDto {
    private String counterId;
    private Integer value;
    private Integer result;
}
