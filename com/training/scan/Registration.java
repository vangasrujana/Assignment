package com.training.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] userNames = { "tina", "kiran", "anjali" };
		System.out.println("enter name to register");
		String userName = sc.next();
		boolean result=false;
		for (String name : userNames) {

			if (userName.equals(name)) {
				result=true;
			} 
		}
		
		if(result)
		{
			System.out.println("In a username");
		}
		else
		{
			System.out.println("Not registared");
		}


	}

}
