package com.example.numberscounter.mapper;

import com.example.numberscounter.model.dto.CounterDto;
import com.example.numberscounter.model.entity.Counter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CounterMapper {
    CounterDto toCounterDto(Counter counter);
    Counter toCounter(CounterDto counterDto);
}
