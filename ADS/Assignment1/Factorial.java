import java.util.Scanner;
class Factorial{
	
	public static long computefactorial(int num){
		if(num == 0 || num == 1){
			return 1;
		}
		
		long result = 1;
		
		for(int i =1; i<= num;i++){
			result = result * i;
		}
		
		return result;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find a factorial");
		
		int num = sc.nextInt();
		
		long factorial = computefactorial(num);
		System.out.println("Factorial "+num+" is"+factorial);
		sc.close();
		
	}
}