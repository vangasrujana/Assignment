package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		 int arr[] = {10, 32, 45, 90, 980};
		 int greatest = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > greatest) {
	                greatest = arr[i];
	            }
	        }

	        System.out.println( greatest);
	    }
	}
		 
		 

