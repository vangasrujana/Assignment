package com.objects.basics;

public class Main {
	public static void main(String[] args) {
		Book book1=new Book("maths", "sunny", 200, "equations");
		book1.getDetails();
		book1.checkBookType();
		
		Book book2=new Book("science","Newton",798.00,"physics");
		book2.getDetails();
		book2.checkBookType();

}
}
