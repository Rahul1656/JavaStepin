package com.Ltts;
import java.util.Scanner;
public class EmployeeMain 
{
	
	public static void main(String[] args)
	{
		String name,Address,Mobile;
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.next();
		e.setName(name);
		System.out.println("Enter Address:");
		Address=sc.next();
		e.setAdress(Address);
		e.setAdress("Pune");
		System.out.println("Enter Mobile:");
		Mobile=sc.next();
		e.setMobile(Mobile);
		
		System.out.println("Employee Details");
		System.out.println("Name:"+e.getName());
		System.out.println("Address:"+e.getAdress());
		System.out.println("Phone:"+e.getMobile());
		
		
	}

}
