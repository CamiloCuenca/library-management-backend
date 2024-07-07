package com.library.library_management.service;

import com.library.library_management.entity.Loan;
import com.library.library_management.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    @Autowired
    LoanRepository loanRepository;

    public List<Loan> getAllLoan(){
        return loanRepository.findAll();
    }

    public Optional<Loan> getloanById(Long id){
        return loanRepository.findById(id);
    }

    public void saveOrUpdate(Loan loan){
        loanRepository.save(loan);
    }

    public void delete(Long id){
        loanRepository.deleteById(id);
    }

}
