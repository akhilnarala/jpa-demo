package com.demo.client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.AccountDao;
import com.demo.entity.CustomerDao;

//@Repository("jpa-app")
@Repository
@Transactional
public class CustAccImplBackUp {
	
	@PersistenceContext
	private EntityManager em;
	
	public void addAccount(AccountDao a,CustomerDao c) {
		a.setCustomer(c);
		em.persist(a);
		System.out.println("Customer Saved Successfully");
	}
	
	public void findCustomer(int id) {
		AccountDao a = em.find(AccountDao.class, id);
		System.out.println("Customer Name: "+a.getCustomer().getCustomerName()+"  Customer Id: "+a.getCustomer().getCustomerId()
				+ "  Account Number: "+a.getAccountNumber()+"  Balance:"+a.getBalance());
	}
	public void addCustomer(CustomerDao c) {
		em.persist(c);
	}
}