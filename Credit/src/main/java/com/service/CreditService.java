package com.service;


import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.Credit;
@Service

public interface CreditService {
Credit saveCredit(Credit credit);
    
    Optional<Credit> getById(int ssnNumber);

    double findByUsingSsnNumber(int ssnNumber);

 
	
	
	

	

}
