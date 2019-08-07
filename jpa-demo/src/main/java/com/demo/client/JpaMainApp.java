package com.demo.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.transaction.Transaction;

import com.demo.entity.Dept;
import com.demo.entity.Emp;

public class JpaMainApp {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			Dept dept = em.find(Dept.class, 20);
			Emp e1 = new Emp(203, "Arsh", "Sec", 50000);
			Emp e2 = new Emp(204, "Vaisrav", "Ec", 35000);

			e1.setDept(dept);
			e2.setDept(dept);

			em.persist(e1);
			em.persist(e2);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}

		finally {
			em.close();
		}

	}
}
