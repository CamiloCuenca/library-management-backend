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

    //Constructor
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    /** This method is the GET request that returns all loan
     *
     * @return All loan
     */
    @GetMapping
    public List<Loan> getAllLoan(){
        return loanService.getAllLoans();
    }

    /** This method is the Get request that return a specific loan
     *
     * @param loan_id
     * @return specific loan
     */
    @GetMapping("/{loan_id}")
    public Optional<Loan> getById(@PathVariable("loan_id")Long loan_id){
        return loanService.getloanById(loan_id);
    }

    /** This is the POST request that save or update a loan
     *
     * @param loan
     */
    @PostMapping
    public void saveOrUpdate(@RequestBody Loan loan){
        loanService.saveOrUpdate(loan);
    }

    /** This is the DELETE request that delete a specific loan
     *
     * @param loan_id
     */
    @DeleteMapping("/{loan_id}")
    public void delete(@PathVariable("loan_id")Long loan_id){
        loanService.delete(loan_id);
    }

}
