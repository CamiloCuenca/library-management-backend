package com.library.library_management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;


@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    /*
    insertable = false, updatable = false: Estas propiedades indican a JPA que no debe incluir esta columna en las sentencias
    INSERT y UPDATE, ya que su valor se establece automáticamente en la base de datos.
     */
    @Column(name = "registration_date", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp registrationDate;
}
