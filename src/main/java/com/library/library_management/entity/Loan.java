package com.library.library_management.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id", nullable = false)
    private Long loanId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "book_id", nullable = false)
    private String bookId;

    @Column(name = "loan_date", nullable = false)
    private Timestamp loanDate;

    @Column(name = "return_date")
    @Temporal(TemporalType.DATE)
    private Date returnDate;

    @Column(name = "returned", nullable = false)
    private boolean returned;
}
