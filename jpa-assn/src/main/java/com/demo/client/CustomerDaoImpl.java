package com.demo.client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.CustomerDao;

@Repository
@Transactional
public class CustomerDaoImpl extends CustomerDao {
	
	@PersistenceContext
	private EntityManager em;

	public void addNewCustomer(CustomerDao c) {
		em.persist(c);
		System.out.println("Customer Added Successfully!");
	}
	
	public void viewCustomerInfo(int custId) {
		CustomerDao c = em.find(CustomerDao.class, custId);
		System.out.println("  Customer Id: " + c.getCustomerId() + "	Customer Name: " + c.getCustomerName());
	}
	
}
