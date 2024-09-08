import java.util.Scanner;

class CompoundInterestCalculator{
	private int amount;
	private double annualIntrestRate;
	private int years;
	
	CompoundInterestCalculator() {
		this.amount=0;
		this.annualIntrestRate=0;
		this.years=0;
	}
	
	CompoundInterestCalculator(int amount,double annualIntrestRate, int years) {
		this.amount = amount;
		this.annualIntrestRate= annualIntrestRate;
		this.years = years;
	}
	
	public void setamount(int amount) {
		this.amount=amount;
	}
	
	public void setannualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate=annualIntrestRate;
	}
	
	public void setyears(int years) {
		this.years = years;
	}
	
	public int getamount() {
		return amount;
	}
	
	public double getannualIntrestRate() {
		return annualIntrestRate;
	}
	
	public int getyears() {
		return years;
	}
	
	 public double calculateCompoundInterest() {
	        return amount * Math.pow((1 + annualIntrestRate / 100), years) - amount;
	    }
	 
	 public double calculateFinalAmount() {
	        return amount * Math.pow((1 + annualIntrestRate / 100), years);
	    }
}

class CompoundInterestCalculatorUtil {
	
	public void menuList() {
		System.out.println("First enter the principle amount");
		System.out.println("Second enter the annual inrest rate");
		System.out.println("Third enter the years");
		System.out.println();
		System.out.println();
	}
	
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principle amount:	  ");
		int amount = sc.nextInt();
		System.out.print("Enter the annual inrest rate:    ");
		double intrest = sc.nextDouble();
		System.out.println("Enter the years:	           ");
		int year = sc.nextInt();
	
	CompoundInterestCalculator comp = new CompoundInterestCalculator(amount, intrest ,year );
	
	
	System.out.println();
	System.out.printf("your final amount is %.2f\n   ", comp.calculateFinalAmount());
	System.out.printf("your compunt intrest rate%.2f\n   ", comp.calculateCompoundInterest());
	
	sc.close();
	}
	
	
}



public class Q2 {

	public static void main(String[] args) {
			
		CompoundInterestCalculatorUtil calculator = new CompoundInterestCalculatorUtil();
		
		calculator.menuList();
		calculator.calculator();
	}

}
