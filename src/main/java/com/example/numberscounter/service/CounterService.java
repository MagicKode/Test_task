package com.example.numberscounter.service;

import com.example.numberscounter.model.dto.CounterDto;
import com.example.numberscounter.model.entity.Counter;

public interface CounterService {
    CounterDto create(CounterDto counterDto);
    Counter getCount(String id);
    Integer incrementCount(CounterDto counterDto);
}
