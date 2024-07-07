package com.library.library_management.repository;

import com.library.library_management.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long> {
}
