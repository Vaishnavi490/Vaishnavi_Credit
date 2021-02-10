package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Credit;
import com.service.CreditService;

@RestController
public class controller {

	@Autowired
    public CreditService creditService ;

 

    @RequestMapping(value = "/credit" , method = RequestMethod.POST)
    public Credit addApplicant(@RequestBody  (required = false)   Credit credit) {
        return this. creditService.saveCredit(credit);
    }
    
    @GetMapping(value="/credit/{ssnNumber}")
    public Optional<Credit> getApplicant(@PathVariable int ssnNumber) {
        return this.creditService.getById(ssnNumber);
    }

    @GetMapping(value="/getCreditScore/{ssnNumber}")
    public Double findCreditScore(@PathVariable int ssnNumber)  {
        
        double creditScore =     this.creditService.findByUsingSsnNumber(ssnNumber);
            double currentAnualIncome = this.creditService.findByUsingSsnNumber(ssnNumber);
            if(creditScore > 700) {
                double santionedLoanamount = currentAnualIncome / 2 ; 
               // System.out.println("credit score is more than 700 so it is printing sanctioned loan amount");
                return santionedLoanamount ;    
            }
            else {
                return creditScore;
            }
    }
}

