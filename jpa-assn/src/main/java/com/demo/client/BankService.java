package com.demo.client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.AccountDao;
import com.demo.entity.CustomerDao;

@Service
public class BankService {

	Scanner sc = new Scanner(System.in);
	@Autowired
	private CustomerDaoImpl custDaoImpl;
	@Autowired
	private AccountDaoImpl accDaoImpl;
	
	int custId,accNumber,accBalance;
	String custName;

	public void createCustomer() {
		System.out.print("Enter Customer ID: ");
		custId = sc.nextInt();
		System.out.print("Enter Customer Name: ");
		custName = sc.next();
		System.out.print("Enter Account Number: ");
		accNumber = sc.nextInt();
		System.out.print("Enter Account Balance: ");
		accBalance = sc.nextInt();
		CustomerDao c = new CustomerDao(custId, custName);
		custDaoImpl.addNewCustomer(c);
		AccountDao a = new AccountDao(accNumber, accBalance);
		accDaoImpl.addNewAccount(a,custId);
	}
	public void createAccount() {
		System.out.print("Enter Customer ID: ");
		custId = sc.nextInt();
		System.out.print("Enter Account Number: ");
		accNumber = sc.nextInt();
		System.out.print("Enter Account Balance: ");
		accBalance = sc.nextInt();
		AccountDao a = new AccountDao(accNumber, accBalance);
		accDaoImpl.addNewAccount(a,custId);
	}

	public void findCustomer() {
		System.out.print("Enter Customer ID: ");
		int custId = sc.nextInt();
		custDaoImpl.viewCustomerInfo(custId);
	}
	
}