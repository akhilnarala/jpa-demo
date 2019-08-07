package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTS")
public class AccountDao {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ACNO")
	private int accountNumber;
	
	@Column(name="ACBALANCE")
	private double balance;
	
	@ManyToOne
	@JoinColumn(name="CUSTID")
	private CustomerDao customer;
	
	public AccountDao() {
		// TODO Auto-generated constructor stub
	}

	public AccountDao(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public CustomerDao getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDao customer) {
		this.customer = customer;
	}
	
	
	
}
