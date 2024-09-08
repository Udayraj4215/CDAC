import java.util.Scanner;

class Principle{
	private int principlAmount;	
	private int intrestrate;
	private int loan;
	
	public int getPrinciplAmount() {
		return principlAmount;
	}
	public void setPrinciplAmount(int principlAmount) {
		this.principlAmount = principlAmount;
	}
	public int getIntrestrate() {
		return intrestrate;
	}
	public void setIntrestrate(int intrestrate) {
		this.intrestrate = intrestrate;
	}
	public int getLoan() {
		return loan;
	}
	public void setLoan(int loan) {
		this.loan = loan;
	}
	
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a principle amount (Rs.)");
		setPrinciplAmount(sc.nextInt());
		
		System.out.println("Enter the annual intrest rate");
		setIntrestrate(sc.nextInt());
		
		System.out.println("Enter the loan term");
		setLoan(sc.nextInt());
	}
	public double calculatemonthlypayment() {
		
		double monthlyInrestRate = getIntrestrate() / 12 /100;
		int numberofMonths = getLoan() * 12;
		
		double monthlypayment = getPrinciplAmount() * (intrestrate * Math.pow(1 + monthlyInrestRate, numberofMonths)) 
				/ (Math.pow(monthlyInrestRate, numberofMonths) -1);
				
				return monthlypayment; 
	}
	
	public void printRecord(double monthlypayment) {
		int numberOfMonths = getLoan() * 12;
		double totalpayment = monthlypayment * numberOfMonths;
		
		System.out.printf("\nPrinciple: %.2f", getPrinciplAmount());
		System.out.printf("\nAnnual Intrest rate %.2f%",getIntrestrate());
		System.out.printf("\nloan term: %d years", getLoan());
		System.out.printf("\nmonthly payment: %.2f",monthlypayment);
		System.out.printf("\ntotal amount paid over the loan term%.2f\n",totalpayment);
	}
	
	
}

public class Q1 {

	public static void main(String[] args) {
		Principle pr = new Principle();
		
		pr.acceptRecord();
		
		double monthlypayment = pr.calculatemonthlypayment();
		
		pr.printRecord(monthlypayment);
		
		
	}

}