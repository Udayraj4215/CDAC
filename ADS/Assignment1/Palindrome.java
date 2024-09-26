import java.util.Scanner;
class Palindrome{
	public static boolean isPalindrome(int num){
		if(num < 0){
			return false;
		}
		
		int originalnum = num;
		int reversednum = 0;
		
		while(num > 0){
			int lastdigit = num%10;
			reversednum = reversednum*10+lastdigit;
			num = num /10;
		}
		
		return originalnum == reversednum;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer for cheaking");
		int input = sc.nextInt();
		boolean res = isPalindrome(input);
		System.out.println("Output "+ res);
		sc.close();
	}
}