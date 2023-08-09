package com.example.numberscounter.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Validated
public class CounterDto {
    @NotBlank(message = "Counter Id should be specified")
    @Size(max = 10, message = "Counter id should fit in 10 symbols")
    private String counterId;
    @Min(value = 1, message = "Increment Value should be greater than 0")
    @NotNull(message = "Increment Value should be specified")
    private Integer incrementValue;
    private Integer result;
}
