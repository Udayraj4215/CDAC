package in.cdac;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		
		int[] arr = {3,4,2,2,5,6,2};
		Arrays.sort(arr);
		for(int i = arr.length-1; i>= 0 ;i--) {
			System.out.println(arr[i]);
		}
	}
}
