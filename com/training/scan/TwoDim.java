package com.training.scan;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDim {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr = new int[5];
		int[] arr2=new int[arr.length];
		
	
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			arr2[i]=(int) Math.sqrt(arr[i]);
		}
		System.out.println(Arrays.toString(arr2));

	}

}
