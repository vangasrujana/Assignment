package com.training.basic;

public class Amstrong {

	public static void main(String[] args) {
		 int number = 153; // Example number
	        int originalNumber = number;
	        int sum = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, 3);
	            number /= 10;
	        }

	        if (sum == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");

	}

}
}
