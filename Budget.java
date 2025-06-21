package com.geauxtracker.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    @Column(nullable = false)
    private String category;

    private double amount;
}
