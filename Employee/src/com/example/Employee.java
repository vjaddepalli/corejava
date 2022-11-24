package com.example;

public class Employee {
	
	private int baseSalary;
	private int hourlyRate;
	private static int noOfEmployees; //static member creation
	
	//constructor overloading
	public Employee(int baseSalary) {
		this(baseSalary, 0);
	}
	
	public Employee(int baseSalary, int hourlyRate) {
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
		noOfEmployees++;
	}
	
	//static method
	public static void printNoOfEmployees() {
		System.out.println("No of Employees: "+noOfEmployees);
	}

	public int getBaseSalary() {
		return baseSalary;
	}
	
	private void setBaseSalary(int baseSalary) {
		if(baseSalary<=0)
			throw new IllegalArgumentException("base salary can not be 0 or less");
		this.baseSalary = baseSalary;
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}
	
	private void setHourlyRate(int hourlyRate) {
		if(hourlyRate<0)
			throw new IllegalArgumentException("hourly rate can not be 0 or less");
		this.hourlyRate = hourlyRate;
	}

	public int calculateWage(int extraHours) {
		return baseSalary+(hourlyRate*extraHours);
	}
	

}
