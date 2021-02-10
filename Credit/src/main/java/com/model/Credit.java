package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="customer")

public class Credit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ssnNumber;
	private double loanAmount;
	private long  currentAnnualAmount;
	private  double creditScore;
	public Credit(int ssnNumber, double loanAmount, long currentAnnualAmount, double creditScore) {
		super();
		this.ssnNumber = ssnNumber;
		this.loanAmount = loanAmount;
		this.currentAnnualAmount = currentAnnualAmount;
		this.creditScore = creditScore;
	}
	public int getSsnNumber() {
		return ssnNumber;
	}
	public void setSsnNumber(int ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public long getCurrentAnnualAmount() {
		return currentAnnualAmount;
	}
	public void setCurrentAnnualAmount(long currentAnnualAmount) {
		this.currentAnnualAmount = currentAnnualAmount;
	}
	public double getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(double creditScore) {
		this.creditScore = creditScore;
	}
	public Credit() {
		super();
	}
	
	

}
