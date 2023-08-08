package com.example.numberscounter.service;

import com.example.numberscounter.model.dto.CounterDto;

public interface CounterService {
    CounterDto create(CounterDto counterDto);
    Integer getCount(String id);
    Integer incrementCount(CounterDto counterDto);
}
