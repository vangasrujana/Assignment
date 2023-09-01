package com.training.scan;

import java.util.Scanner;

public class Ondim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;
		for (int val : arr) {
			val = sc.nextInt();
			sum = sum + val;

		}
		System.out.println(sum);


	}

}
