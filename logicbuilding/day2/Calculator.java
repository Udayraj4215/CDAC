import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your 1st Number");
	int a = sc.nextInt();
	System.out.println("Enter your 2nd Number");
	int b = sc.nextInt();
	System.out.println("What operations to perform + - / %");
	String str = sc.next();
	
	if("%" == str && a == 0 || b == 0){
		System.out.println("Invalid Number enterd");
	}
	
	switch(str){
		case "+":
		System.out.println(a+b);
		break;
		case "-":
		System.out.println(a-b);
		break;
		case "%":
		System.out.println(a/b);
		break;
		case "/":
		System.out.println(a%b);
		break;
	}

	}
}