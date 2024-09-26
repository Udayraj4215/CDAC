public class Recursion5{
	
	
	public static void print(int n){
		if(n > 5){
			return ;
		}
		else {
			System.out.println(n);
			print(n+1);
		}
	}
	
	public static void main(String[] args){
		print(1);
	}
}