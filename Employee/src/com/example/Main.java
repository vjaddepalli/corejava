package com.example;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee(50_000, 20);
		Employee emp = new Employee(35_000); //with 0 hourly rate
		Employee.printNoOfEmployees(); //calling static member by class name
		int wage = employee.calculateWage(5);
		System.out.println(wage);
		System.out.print(emp.calculateWage(5));
 
	}
	

}
