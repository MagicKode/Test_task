package com.example.numberscounter.service.impl;

import com.example.numberscounter.model.dto.CounterDto;
import com.example.numberscounter.mapper.CounterMapper;
import com.example.numberscounter.model.entity.Counter;
import com.example.numberscounter.repository.CounterRepository;
import com.example.numberscounter.service.CounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

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
        return counterRepository.findCounterByCounterId(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    @Transactional
    public Integer incrementCount(CounterDto counterDto) {
        Counter counter = increment(counterDto);
        counterRepository.save(counter);
        return counter.getResult();
    }

    private Counter increment(CounterDto counterDto) {
        Counter count = getCount(counterDto.getCounterId());
        count.setResult(count.getResult() + counterDto.getIncrementValue());
        return count;
    }
}
