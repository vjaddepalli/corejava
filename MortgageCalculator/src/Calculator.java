import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
 * Mortgage Calculator
 * 
 * M=P((r(1+r)^n)/((1+r)^n)-1)
 * 
 */
public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double principalAmount = 0;
		double annualInterestRate = 0;
		int years = 0;

		while (true) {
			System.out.print("Principal(1k-100K): ");
			principalAmount = sc.nextDouble();
			if (1000 <= principalAmount && 1000000 >= principalAmount)
				break;
			System.out.println("Enter Amount between 1,000 to 1,000,000");
		}

		while (true) {
			System.out.print("Annual Interest Rate:");
			annualInterestRate = sc.nextDouble();
			if (1 <= annualInterestRate && 30 >= annualInterestRate)
				break;
			System.out.println("Enter value between 1 to 30");

		}

		while (true) {
			System.out.print("Period(years):");
			years = sc.nextInt();
			if (1 <= years && 30 >= years)
				break;
			System.out.println("Enter value between 1 to 30");
		}

		double monthlyInterestRate = (annualInterestRate / 100) / 12;
		double noOfMonths = years * 12;
		double mortgageAmount = principalAmount
				* (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), noOfMonths))
						/ (Math.pow(1 + monthlyInterestRate, noOfMonths) - 1));
		NumberFormat mortgageFormat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Mortgage: " + mortgageFormat.format(mortgageAmount));

	}

}
