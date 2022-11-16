import java.text.NumberFormat;
import java.util.Scanner;
/*
 * 
 * Mortgage Calculator
 * 
 */
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Principal:");
		double principalAmount = sc.nextDouble();
		System.out.print("Annual Interest Rate:");
		double annualInterestRate = sc.nextDouble();
		System.out.print("Period(years):");
		int years = sc.nextInt();
		double monthlyInterestRate = (annualInterestRate/100)/12;
		double noOfMonths = years*12;
		double mortgageAmount = principalAmount*(monthlyInterestRate*(Math.pow((1+monthlyInterestRate), noOfMonths))/(Math.pow(1+monthlyInterestRate, noOfMonths)-1));
		System.out.println("Mortgage: $"+String.format("%.2f", mortgageAmount));
		NumberFormat mortgageFormat = NumberFormat.getCurrencyInstance();
		System.out.println("Mortgage: "+mortgageFormat.format(mortgageAmount));

	}

}
