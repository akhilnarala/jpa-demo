package com.demo.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.entity.AccountDao;
import com.demo.entity.CustomerDao;
import com.demo.spring.JpaConfig;

public class SpringJpaMain {
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
	}
}
