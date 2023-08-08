package com.example.numberscounter.service.impl;

import com.example.numberscounter.model.dto.CounterDto;
import com.example.numberscounter.model.mapper.CounterMapper;
import com.example.numberscounter.repository.CounterRepository;
import com.example.numberscounter.service.CounterService;
import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService {
    private final CounterRepository counterRepository;
    private final CounterMapper counterMapper;

    public CounterServiceImpl(CounterRepository counterRepository, CounterMapper counterMapper) {
        this.counterRepository = counterRepository;
        this.counterMapper = counterMapper;
    }

    @Override
    public CounterDto create(CounterDto counterDto) {
        return counterMapper.toCounterDto(counterRepository.save(counterMapper.toCounter(counterDto)));
    }

    @Override
    public Integer getCount(String id) {
        return counterRepository.findCounterByCounterId(id);
    }

    @Override
    public Integer incrementCount(CounterDto counterDto) {
        return Integer.valueOf(counterDto.getCounterId() + counterDto.getValue());
    }
}
