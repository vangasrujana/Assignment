package com.inter.interfaces3;
import java.util.function.*;

public class Checkname {
	public static void main(String[] args) {
		BiConsumer<String,Integer> adminCheck=(name,age)->{
			if("Admin".equalsIgnoreCase(name) && age>30) {
				System.out.println("welcome");
				}
				else {
					System.out.println("wrong user");
			}
		};
		String userName="Admin";
		int userAge=45;
		adminCheck.accept(userName,userAge);
				}

}
