package com.example.numberscounter.model.mapper;

import com.example.numberscounter.model.dto.CounterDto;
import com.example.numberscounter.model.entity.Counter;
import org.mapstruct.Mapper;

@Mapper
public interface CounterMapper {
    CounterDto toCounterDto(Counter counter);
    Counter toCounter(CounterDto counterDto);
}
