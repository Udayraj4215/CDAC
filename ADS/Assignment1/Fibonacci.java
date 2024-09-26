import java.util.Scanner;
class Fibonacci{
	
	public static void printFibonacci(int n){
		int first =0,second = 1;
		
		if( n >= 0){
			System.out.println(first+" ");
		}
		if(n >= 1){
			System.out.println(second+" ");
		}
		System.out.print("[");
		for(int i =3; i<=n;i++){
			int next = first + second;
			System.out.print(next+" ");
			
			first = second;
			second = next;
		}
		System.out.println("]");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find a factorial");
		
		int num = sc.nextInt();
		
		printFibonacci(num);
		
		
	}
}