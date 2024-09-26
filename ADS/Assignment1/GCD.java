import java.util.Scanner;
class GCD{
	
	public static int findGCD(int a, int b){
		while( b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int num = sc.nextInt();
		System.out.println("Enter a second number");
		int num2 = sc.nextInt();
		
		int GCD = findGCD(num, num2);
		
		System.out.println("the GCD of "+num+" and "+num2+" is "+GCD);
		sc.close();
	}
	
}