package com.library.library_management.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String author;
    private int releaseYear;
    private String genre;
    private double price;
    private int stock;
    private String publisher;

}
