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

    /** This method returns all loans
     *
     * @return All loans
     */
    public List<Loan> getAllLoans(){
        return loanRepository.findAll();
    }

    /** This method return a specific loan
     *
     * @param id
     * @return specific loan
     */
    public Optional<Loan> getloanById(Long id){
        return loanRepository.findById(id);
    }

    /**  This method save or update a loan
     *
     * @param loan
     */
    public void saveOrUpdate(Loan loan){
        loanRepository.save(loan);
    }

    /** This method delete a specific loan
     *
     * @param id
     */
    public void delete(Long id){
        loanRepository.deleteById(id);
    }

}
