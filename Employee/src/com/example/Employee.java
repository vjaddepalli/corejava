package com.example;

public class Employee {
	
	private int baseSalary;
	private int hourlyRate;
	
	public int getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(int baseSalary) {
		if(baseSalary<=0)
			throw new IllegalArgumentException("base salary can not be 0 or less");
		this.baseSalary = baseSalary;
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}
	
	public void setHourlyRate(int hourlyRate) {
		if(hourlyRate<=0)
			throw new IllegalArgumentException("hourly rate can not be 0 or less");
		this.hourlyRate = hourlyRate;
	}

	public int calculateWage(int extraHours) {
		return baseSalary+(hourlyRate*extraHours);
	}
	

}
