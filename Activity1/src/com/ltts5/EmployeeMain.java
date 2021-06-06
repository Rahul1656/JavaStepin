package com.ltts5;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   String name,address,mobile;
	   int ch;
       Employee e=new Employee();
       System.out.println("Enter the name:");
       name=sc.next();
       e.setName(name);
       System.out.println("Enter the adress:");
       address=sc.next();
       e.setAdress(address);
       System.out.println("Enter Mobile:");
       mobile=sc.next();
       e.setMobile(mobile);
       
       //sample output
       e.displayInfo();
       //update
       System.out.println("Verify and Update the details:");
       System.out.println("Menu");
       System.out.println("1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4. All information correct/Exit");
       ch=sc.nextInt();
       
       if(ch==1)
       {
    	   System.out.println("Name:"+e.getName());
    	   System.out.println("Enter the Name:");
    	   name=sc.next();
    	   e.setName(name);
    	   e.displayInfo();
       }
       else if(ch==2)
       {
    	   System.out.println("Current address is:"+e.getAdress());
    	   System.out.println("Enter the address:");
    	   address=sc.next();
    	   e.setAdress(address);
    	   e.displayInfo();
    	   
       }
       else if (ch==3)
       {
    	   System.out.println("Mobile:"+e.getName());
    	   System.out.println("Enter the Mobile number:");
    	   mobile=sc.next();
    	   e.setMobile(mobile);
    	   e.displayInfo();
       }
       else
       {
    	   e.displayInfo();
       }
       
       
	}

}
