import java.util.*;
class Armstrong{
	
	public void display(int n){
		int temp, digits=0, last=0,sum=0;
		
		temp = n;
		
		while(temp > 0){
			temp = temp/10;
			digits++;
		}
		
		temp= n;
		while(temp > 0){
			last = temp % 10;
			sum += (int)(Math.pow(last,digits));
			temp=temp/10;
		}
		
		if(n==sum){
			System.out.print(true);
		}
		else{
			System.out.print(false);
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Armstrong ar = new Armstrong();
		int num = sc.nextInt();
		
		
		ar.display(num);
		
		
		
	}
}