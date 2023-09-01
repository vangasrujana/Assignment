package com.shiristi.overloading;

public class OverloadMain {
	public static void main(String[] args) {
		Employee employee=new Employee("sai","programmer");
		double detail1=employee.calcBonus(6000);
		System.out.println(detail1);
		Employee employee1=new Employee("saikiran","manager");
		double detail2=employee1.calcBonus(4000, 30000);
		System.out.println(detail2);
		Employee employee2=new Employee("suni","director");
		double detail3=employee2.calcBonus(2000, 40000, 60000);
		System.out.println(detail3);

}
}
