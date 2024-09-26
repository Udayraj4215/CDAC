import java.util.Scanner;
class Prime{
	
	public static boolean isPrime(int num){
		if(num < 2){
			return false;
		}
		
		for(int i =2; i<=Math.sqrt(num);i++){
			if(num % 1 == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to cheak a prime number");
		int num = sc.nextInt();
		
		if(isPrime(num)){
			System.out.println(num+"it's a prime number");
		} else {
			System.out.println(num+"It's not a prime number");
		}
		
		
	}
}