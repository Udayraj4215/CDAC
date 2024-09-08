import java.util.Scanner;

class DiscountCalculator{
	private double ogprice;
	private double discount;
	
	public DiscountCalculator() {
		this.ogprice=0;
		this.discount=0;
	}
	
	DiscountCalculator(double ogprice, double discount) {
		this.ogprice = ogprice;
		this.discount=discount;
	}
	
	public void setogprice(double ogprice) {
		this.ogprice=ogprice;
	}
	
	public void setdiscount(double discount) {
		this.discount=discount;
	}
	
	public double getogprice() {
		return this.ogprice;
	}
	
	public double getdiscount() {
		return this.discount;
	}

	public double discountedprice() {
		return ogprice * (discount / 100);
		
	}

	public double finalPrice() {
		return ogprice-discountedprice();
	}
	
	
	
}

class DiscountCalculatorUtil{
	private double price;
	private double discount;
	DiscountCalculator cal = new DiscountCalculator();
	Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Enter a original price of item ");
		price = sc.nextDouble();
		System.out.println("Enter a discount price on item ");
		discount = sc.nextDouble();
		
		cal.setogprice(this.price);
		cal.setdiscount(this.discount);
	}
	
	public void printRecord() {
		System.out.println("you enter a inte price is "+cal.getogprice());
		System.out.println("you enter a discount price is "+cal.getdiscount());
		
		System.out.println("your discounted amount is "+cal.discountedprice());
		System.out.println("your final price calculation is "+cal.finalPrice());
		
		
	}
}

public class Q4 {
	public static void main(String[] args) {
		DiscountCalculatorUtil calculate = new DiscountCalculatorUtil();
		
		calculate.acceptRecord();
		calculate.printRecord();
	}

}
