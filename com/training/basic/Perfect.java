package com.training.basic;

public class Perfect {

	public static void main(String[] args) {
		 int number = 28; // Example number
	        int sumOfDivisors = 0;

	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sumOfDivisors += i;
	            }
	        }

	        if (sumOfDivisors == number) {
	            System.out.println(number + " is a perfect number.");
	        } else {
	            System.out.println(number + " is not a perfect number.");

	}

}
}
