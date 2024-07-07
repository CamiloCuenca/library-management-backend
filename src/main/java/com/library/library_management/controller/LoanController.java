package com.library.library_management.controller;

import com.library.library_management.entity.Loan;
import com.library.library_management.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("v1/Loan")
public class LoanController {

    @Autowired
    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping
    public List<Loan> getAllLoan(){
        return loanService.getAllLoan();
    }

    @GetMapping("/{loan_id}")
    public Optional<Loan> getById(@PathVariable("loan_id")Long loan_id){
        return loanService.getloanById(loan_id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Loan loan){
        loanService.saveOrUpdate(loan);
    }

    @DeleteMapping("/{loan_id}")
    public void delete(@PathVariable("loan_id")Long loan_id){
        loanService.delete(loan_id);
    }

}
