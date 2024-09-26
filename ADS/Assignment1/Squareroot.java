import java.util.Scanner;
class Squreroot{
	
	public static int findsqrt(int x){
		if(x == 0 || x ==1){
			return x;
		}
		
		int start =1, end = x, result = 0;
		
		while(start <= end){
			int mid = (start+end)/2;
			
			if (mid * mid == x){
				return mid;
			}
			
			if(mid * mid < x){
				start = mid +1;
				result =  mid;
			} else {
				end = mid -1;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find square root");
		int x = sc.nextInt();
		int squareroot = findsqrt(x);
		
		System.out.println(squareroot);
		sc.close();
	}
}