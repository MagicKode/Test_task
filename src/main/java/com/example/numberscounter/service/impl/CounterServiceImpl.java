package com.example.numberscounter.service.impl;

import com.example.numberscounter.model.dto.CounterDto;
import com.example.numberscounter.mapper.CounterMapper;
import com.example.numberscounter.model.entity.Counter;
import com.example.numberscounter.repository.CounterRepository;
import com.example.numberscounter.service.CounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class CounterServiceImpl implements CounterService {
    private final CounterRepository counterRepository;
    private final CounterMapper counterMapper;

    @Override
    @Transactional
    public CounterDto create(CounterDto counterDto) {
        return counterMapper.toCounterDto(counterRepository.save(counterMapper.toCounter(counterDto)));
    }

    @Override
    public Counter getCount(String id) {
        return counterRepository.getReferenceById(id);
    }

    @Override
    @Transactional
    public Integer incrementCount(CounterDto counterDto) {
        Integer increment = increment(counterDto);
        counterDto.setResult(increment);
        counterRepository.save(counterMapper.toCounter(counterDto));
        return increment;
    }

    private Integer increment(CounterDto counterDto) {
         return Integer.valueOf(counterDto.getCounterId() + counterDto.getIncrementValue());
    }
}
