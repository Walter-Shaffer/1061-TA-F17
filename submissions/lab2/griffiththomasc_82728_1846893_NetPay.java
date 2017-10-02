package tester;

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of hours Work per week");
		int keyboard = sc.nextInt();
		double FederalTaxPercent = 10.00;
		double StateTaxPercent = 4.5;
		double SSPercent = 6.2;
		double MediCarePercent = 1.45;
		double PayPerHour = 7.25;
		double grossPay; 
		double netPay;
		double federalTax;
		double stateTax;
		double mediCare;
		double socialSecurity;
		double hoursPerWeek = keyboard;
		
		grossPay = (hoursPerWeek*PayPerHour);
		
		federalTax = ((grossPay*FederalTaxPercent)/100);
		
		stateTax = ((grossPay*StateTaxPercent)/100);
		
		socialSecurity = ((grossPay*SSPercent)/100);
		
		mediCare = ((grossPay*MediCarePercent)/100);
		
		netPay = (grossPay -(federalTax + stateTax + mediCare + socialSecurity )); 
				
				
		System.out.println("Hours Per Week:          " + hoursPerWeek);
		System.out.println("Gross Pay:               " + grossPay);
		System.out.println("Net Pay:                 " + netPay);
		System.out.println("____________________________________");
		System.out.println("Deductions");
		System.out.println("Federal:                 " + federalTax);
		System.out.println("State:                   " + stateTax);
		System.out.println("Social Security:         " + socialSecurity);
		System.out.println("Medicare:                " + mediCare);
	}
	}