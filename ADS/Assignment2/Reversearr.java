import java.util.Scanner;
import java.util.Arrays;

class Reversearr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0; i< size; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int[] newarr = new int[size];
		for(int i = 0; i<size;i++){
			newarr[i] = arr[size-i];
		}
		
		System.out.println(Arrays.toString(newarr));
	}
}