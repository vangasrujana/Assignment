package com.training.scan;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter an integer start");
		int start=s.nextInt();
		System.out.println("enter an integer end");
		int end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);

	}

}
	}
}
