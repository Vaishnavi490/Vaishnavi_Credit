package com.dao;



//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Credit;

 
@Repository
public interface CreditDao extends CrudRepository<Credit,Integer>{

 

    // @Query("select creditScore from customer a where a.ssnNumber = :ssnNumber")
        double findByUsingSsnNumber(int ssnNumber);
    

 

}
 