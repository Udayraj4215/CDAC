import java.util.Scanner;
class Leapyear{
	
	public static String leapcheak(int year){
		if(year % 4 == 0){
			return "It's a leap year";
		} else if(year % 400 == 0){
			return "It's leap year";
		} else if(year % 100 == 0 && year % 400 ==0){
			return "It's leap year";
		}
		return "it's not a eap year";
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to cheak a leap year");
		int year = sc.nextInt();
		String res = leapcheak(year);
		System.out.println(res);
	}
}