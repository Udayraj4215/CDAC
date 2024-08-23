import java.util.Scanner;
class passfail{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a >= 40 && b >= 40 && c >= 40){
			System.out.println("pass");
		}
		if(a < 40){
			System.out.println("a");
		}
		if(b < 40){
			system.out.println("b");
		}
		if(c<40){
			System.out.println("c");
		}
	}
}