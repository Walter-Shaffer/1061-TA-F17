
public class NetPay {

	public static void main(String[] args){
final double FEDERAL_TAX_PERCENT = 10.0 ;
final double STATE_TAX_PERCENT = 4.5 ;
final double SS_PERCENT = 6.2 ;
final double MEDICARE_PERCENT = 1.45 ;
final double PAY_PER_HOUR = 7.25 ;
int hoursPerWeek ;
double grossPay ;
double netPay ;
double federalTax ;
double stateTax ;
double medicare ;
double socialSecurity  ;
hoursPerWeek = 40 ;
grossPay=hoursPerWeek*PAY_PER_HOUR ;
federalTax=(grossPay*FEDERAL_TAX_PERCENT)/100 ;
stateTax=grossPay*STATE_TAX_PERCENT/100 ;
socialSecurity=grossPay*SS_PERCENT/100 ; 
medicare=grossPay*MEDICARE_PERCENT/100 ;
netPay=grossPay-(federalTax+stateTax+medicare+socialSecurity) ;
System.out.println("Hours per Week:\t" +hoursPerWeek+"\nGross Pay:\t"+grossPay+"\nNet Pay:\t"+netPay+"\n\n\nDeductions\nFederal:\t"+federalTax+"\nState:\t\t"+stateTax+"\nSocial Security\t"+socialSecurity+"\nMedicare:\t"+medicare+"\n") ;
	}}

