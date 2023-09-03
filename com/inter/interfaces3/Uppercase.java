package com.inter.interfaces3;
import java.util.function.*;
public class Uppercase {
	public static void main(String[] args) {
		Supplier<String> uppercaseName = () ->"RAGHU".toUpperCase();
		String uppercaseName1=uppercaseName.get();
		System.out.println("uppercase Name:"+uppercaseName1);
		
	}


}
