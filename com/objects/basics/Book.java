package com.objects.basics;

public class Book {
	String title;
	String author;
	double price;
	String category;
	public Book(String title, String author, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	void getDetails()
	{
		System.out.println("title="+title);
		System.out.println("author="+author);
		System.out.println("price="+price);
		System.out.println("category="+category);
	}
	void checkBookType()
	{
		if(price>500)
		System.out.println("premium books");
		else
			System.out.println("standard books");

	}
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
}
