package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MYEMP")
public class Emp {
	
	@Id
	@Column(name="EMPNO")
	private int empId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ADDRESS")
	private String city;
	
	@Column(name="SALARY")
	private double sal;
	
	@ManyToOne
	@JoinColumn(name="DNO")
	private Dept dept;
	
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String name, String city, double sal) {
	
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
