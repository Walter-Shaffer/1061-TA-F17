import java.util.Scanner;
public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter Hours Per Week");
		int hoursPerWeek=keyboard.nextInt();
		double FEDERAL_TAX_PERCENT=10;
		double STATE_TAX_PERCENT=4.5;
		double SS_PERCENT=6.2;
		double MEDICARE_PERCENT=1.45;
		double PAY_PER_HOUR=7.25;
		double grossPay=hoursPerWeek*PAY_PER_HOUR;
		double federalTax=(grossPay*FEDERAL_TAX_PERCENT)/100;
		double stateTax=(grossPay*STATE_TAX_PERCENT)/100;
		double medicare=(grossPay*MEDICARE_PERCENT)/100;
		double socialSecurity=(grossPay*SS_PERCENT)/100;
		double netPay=grossPay-(federalTax+stateTax+medicare+socialSecurity);
		System.out.print("Hours per Week:\t"+hoursPerWeek);
		System.out.println();
		System.out.print("Gross Pay:\t"+grossPay);
		System.out.println();
		System.out.println("Net Pay:\t"+netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.print("Federal:\t"+federalTax);
		System.out.println();
		System.out.print("State:\t\t"+stateTax);
		System.out.println();
		System.out.print("Social Security:"+socialSecurity);
		System.out.println();
		System.out.print("Medicare:\t"+medicare);
	
	
	}

}
