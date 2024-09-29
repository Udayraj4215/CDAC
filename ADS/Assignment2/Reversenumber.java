import java.util.Scanner;
class Reversenumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int temp =0;
		
		while(num > 0){
			int var = num % 10;
			temp = temp * 10 + var;
			num = num / 10;
		}
		
		System.out.println(temp);
	}
}