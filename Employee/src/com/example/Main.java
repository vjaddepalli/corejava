package com.example;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setBaseSalary(30000);
		employee.setHourlyRate(20);
		int wage = employee.calculateWage(5);
		System.out.println(wage);
 
	}
	

}
