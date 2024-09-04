import java.util.Scanner;
class Leap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year to cheak");
		int year = sc.nextInt();
		
		if(year%400 ==0){
			System.out.println("Its a leap year");
		}
		else if (year %100 ==0){
			System.out.println("It's a not leap year");
		}
		else if(year%4 == 0) {
			System.out.println("It's a leap year");
		} 
		else {
			System.out.println("It's a leap year");
		}
	}
}