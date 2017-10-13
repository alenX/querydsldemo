package com.example.querydsldemo.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
