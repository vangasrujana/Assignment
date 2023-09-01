package com.training.basic;

public class LargeSecond {

	public static void main(String[] args) {
		int[] arr= {3,4,56,1,90};
		int number1=arr[0];
		int number2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==number1)
				continue;
			if(arr[i]>number1)
			{
				number2=number1;
				number1=arr[i];
			}else if(number1==number2||arr[i]<number2)
			{
				number2=arr[i];
			}
				
			
		}
		System.out.println(number2);
		


	}

}
