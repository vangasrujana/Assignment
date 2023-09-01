package com.shiristi.overloading;

public class Student {
	String name;
	String department;
	int id;
	public Student(String name, String department,int id) {
		super();
		this.name = name;
		this.department = department;
		this.id=id;
	}
	void printDetails()
	{
		System.out.println("name="+name);
		System.out.println("department="+department);
		System.out.println("id="+id);
	}
	String getGrades(int...marks)
	{
		int sum=0;
		for(int mark:marks)
		{
			sum+=mark;
		}
		int avg=sum/marks.length;
		if(avg>=90 && avg<=100)
		{
			return "A";
		}
		else if(avg>=80 && avg <90)
		{
			return "B";
		}
		else if(avg>=70 && avg <80)
		{
			return "C";
		}
		else if(avg>=60 && avg <70)
		{
			return "D";
		}
		else if(avg>=50 && avg <59)
		{
			return "B";
		}
		return "fail";

}
}