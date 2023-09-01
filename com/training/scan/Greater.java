package com.training.scan;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter integer1=");
		int integer1=scn.nextInt();
		System.out.println("enter integer2=");
		int integer2=scn.nextInt();
		System.out.println("enter integer3=");
		int integer3=scn.nextInt();
		int max=(integer1>integer2)? (integer1>integer3?integer1:integer3):(integer2>integer3?integer2:integer3);
		 System.out.println(max);

	}

}
