package codinchallange;

import java.util.Arrays;
import java.util.Scanner;

class Demo2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		//int n = sc.nextInt();
		int[] arr = {1,2,3,4,5,6,7,8,8};
		           //0 1 2 3 4 5 6 7 8
		int k=3;         
		double sum=0;
//		int median = 0;
		int count = 0;
		int[] arr1 = new int[9-2];
		for(int i=0;i<7;i++)
		{
//			median =0;
			sum=0;
			for(int j=i;j<k+i;j++)
			{
			 sum += arr[j]; 
			}
		
			arr1[count++] =(int) Math.ceil(sum/k);
		}
		
         System.out.println(Arrays.toString(arr1));	
         
         //System.out.println((int)Math.floor(0.4));
	}
}