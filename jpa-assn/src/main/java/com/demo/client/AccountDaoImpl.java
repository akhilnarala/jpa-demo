package com.demo.client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.AccountDao;
import com.demo.entity.CustomerDao;

@Repository
@Transactional
public class AccountDaoImpl extends AccountDao {
	
	@PersistenceContext
	private EntityManager em;

	public void addNewAccount(AccountDao a,int custId) {
		a.setCustomer(em.find(CustomerDao.class, custId));
		em.persist(a);
		System.out.println("Account Added Successfully!");
	}
	
}
