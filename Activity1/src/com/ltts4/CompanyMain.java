package com.ltts4;
import java.util.Scanner;
public class CompanyMain {

	public static void main(String[] args) 
	{
	   Company c=new Company();
	   String c_name;
	   String employees;
	   String team_lead;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the company name:");
       c_name=sc.next();
       c.setName(c_name);
       System.out.println("Enter the employees:");
       employees=sc.next();
       c.setEmployees(employees);
       System.out.println("Enter TeamLead:");
       team_lead=sc.next();
       c.setTeamlead(team_lead);
       //sample output
       
       System.out.println("Name:"+c.getName());
       System.out.println("Emploees:"+c.getEmployees());
       System.out.println("Lead:"+c.getTeamlead());
       
       
	}

}
