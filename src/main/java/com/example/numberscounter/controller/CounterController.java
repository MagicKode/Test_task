package com.example.numberscounter.controller;

import com.example.numberscounter.model.dto.CounterDto;
import com.example.numberscounter.model.entity.Counter;
import com.example.numberscounter.service.CounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/counters")
public class CounterController {

    private final CounterService counterService;

    @PostMapping
    public ResponseEntity<CounterDto> create(@RequestBody CounterDto counterDto) {
        return new ResponseEntity<>(counterService.create(counterDto), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Counter> get(@PathVariable String id){
        return new ResponseEntity<>(counterService.getCount(id), HttpStatus.OK);
    }

    @PostMapping(path = "/increment")
    public ResponseEntity<Integer> incrementCount(@RequestBody CounterDto counterDto) {
        return new ResponseEntity<>(counterService.incrementCount(counterDto), HttpStatus.OK);
    }
}
