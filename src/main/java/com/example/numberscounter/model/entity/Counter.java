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

@Table(name = "counter")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Counter {
    @Id
    @Column(name = "counterId")
    private String counterId;
    @Column(name = "increment_value")
    private Integer increment_value;
    @Column(name = "result")
    private Integer result;
}
