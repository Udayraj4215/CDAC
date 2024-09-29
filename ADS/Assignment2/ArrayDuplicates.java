import java.util.Scanner;
import java.util.Arrays;
class ArrayDuplicates{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0; i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int count = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {  
            if (arr[i] == arr[i + 1]) {  
                ++count;
            }
        }
		
		System.out.println(count);
	}
}