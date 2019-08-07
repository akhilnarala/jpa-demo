package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class CustomerDao {

	@Id
	@Column(name = "CUSTID")
	private int customerId;

	@Column(name = "CUSTNAME")
	private String customerName;

	//@OneToMany(cascade = CascadeType.ALL)
	@OneToMany
	@JoinColumn(name = "CUSTID")
	Set<AccountDao> accounts = new HashSet<>();

	public CustomerDao() {
	}

	public CustomerDao(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set<AccountDao> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<AccountDao> accounts) {
		this.accounts = accounts;
	}
	
}
