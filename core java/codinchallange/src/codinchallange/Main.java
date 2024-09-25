package codinchallange;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		
		int sum =0;
		int count =n;
		int average;
		
		System.out.println("enter the arrays values");
		for(int i = 0; i<n;i++) {
			System.out.println("Array index: "+i);
			arr[i] = sc.nextInt();
			sum=sum+arr[i];
		}
		
		average = sum / n;
		
		for(int i = 0;i<n;i++) {
			if(arr[i] > average) {
				System.out.println(arr[i]);
			}
		}
		
		sc.close();
		
	}
}
