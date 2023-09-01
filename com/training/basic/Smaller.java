package com.training.basic;

public class Smaller {

	public static void main(String[] args) {
		 int[] numbers = {10, 5, 20, 15, 30};

	        int smallest = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < smallest) {
	                smallest = numbers[i];
	            }
	        }

	        System.out.println(smallest);
	    }
	}
