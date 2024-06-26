package com.basic.crud.model;

// What is `jakarta` package?
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// What is `lombok` package?
import lombok.Data;

// Why are both needed?
@Entity
@Data
public class User {
    // What does this annotation do?
    @Id
    // What does this annotation do?
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

}