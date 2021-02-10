package com.service;





import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.CreditDao;
import com.model.Credit;

@Service

public  class CreditServiceImpl implements  CreditService {

	   @Autowired
	   public CreditDao creditDao;

	    @Override
	    public Optional<Credit> getById(int ssnNumber) {
	        
	        return this.creditDao.findById(ssnNumber);
	    }


	    @Override
	    public double findByUsingSsnNumber(int ssnNumber) {
	    
	        return this.creditDao.findByUsingSsnNumber(ssnNumber);
	    }



		@Override
		public Credit saveCredit(Credit credit) {
			// TODO Auto-generated method stub
			return this.creditDao.save(credit);
		}



		



	
	
}
