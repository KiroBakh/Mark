package com.example.marks.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cadets")
@Data
public class Cadet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 40)
    private String name;
    @Column(length = 40)
    private String surname;
    @Column(length = 40)
    private String marks;
}
