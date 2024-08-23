import java.util.Scanner;
class Discount{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		double total;
		boolean membership = true;
		
		if(price >= 1000){
			if(membership == true){
				total = price * 0.25;
				System.out.println(total);
			} else{
				total = price *0.20;
				System.out.println(total);
			}
		}
		else if(price > 500 && price < 999){
			if(membership == true){
				total = price * 0.15;
				System.out.println(total);
			} else {
				total = price *0.10;
				System.out.println(total);
			}
			
		}
		else(price < 500){
			if(membership == true){
				total = price * 0.10;
				System.out.println(total);
			} else {
				total = price * 0.05;
				System.out.println(total);
			}
		}
	}
	}
