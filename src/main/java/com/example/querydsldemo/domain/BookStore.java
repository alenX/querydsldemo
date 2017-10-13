package com.example.querydsldemo.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bookStore")
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long bookId;
}
