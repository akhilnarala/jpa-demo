package com.demo.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.entity.AccountDao;
import com.demo.entity.CustomerDao;
import com.demo.spring.JpaConfig;

public class SpringJpaMainBackUp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
		BankService dao = (BankService) ctx.getBean("bankService");

		Scanner sc = new Scanner(System.in);
		int flag = 1;
		while (true) {
			if (flag == 1) {
				System.out.println("All Operations:" + "\n" + "1.Create a New Customer" + "\n"
						+ "2.Create an Account to Existing Customer" + "\n" + "3.View Customer Info" + "\n" + "4.Exit");
				switch (sc.nextInt()) {
				case 1:
					dao.createCustomer();
					break;
				case 2:
					dao.createAccount();
					break;
				case 3:
					dao.findCustomer();
					break;
				case 4:
					flag = 0;
					break;
				default:
					flag = 0;
					break;
				}
			} 
			else {
				System.out.println("Exiting");
				break;
			}
		}
//		CustomerDao c1= new CustomerDao(101,"CustomerOne");
//		CustomerDao c2= new CustomerDao(102,"CustomerTwo");
//		AccountDao a11 = new AccountDao(999, 10000);
//		AccountDao a12 = new AccountDao(998, 20000);
//		AccountDao a21 = new AccountDao(997, 10000);
//		AccountDao a22 = new AccountDao(996, 20000);
//		
//		dao.addCustomer(c1);
//		dao.addCustomer(c2);
//		dao.addAccount(a11, c1);
//		dao.addAccount(a12, c1);
//		dao.addAccount(a21, c2);
//		dao.addAccount(a22, c2);
//		
//		
//		dao.findCustomer(999);
//		dao.findCustomer(998);
//		dao.findCustomer(997);
//		dao.findCustomer(996);
//		
	}
}
