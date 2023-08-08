package com.example.numberscounter.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "numbers_counter")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Counter {
    @Id
    @Column(name = "counter_id")
    private String counterId;
    @Column(name = "increment_value")
    private Integer incrementValue;
    @Column(name = "result")
    private Integer result;
}
