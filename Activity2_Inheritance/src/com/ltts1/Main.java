package com.ltts1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room");
		System.out.println("Select room type:");
		ch=sc.nextInt();
		if(ch==1)
		{
			
		 DeluxeRoom d=new DeluxeRoom("Taj",3200,true,true);
		 d.setRatePerSqFeet(10);
		 d.getRatePerSqFeet();
			
		}
		else if(ch==2)
		{
			DeluxeACRoom da=new DeluxeACRoom("Taj",3200,true,true);
			da.SetratePerSqFeet(12);
		}
		else
		{
			SuiteACRoom s=new SuiteACRoom("Taj",3200,true,true);
			s.setRatePerSqFeet(15);
			s.getRatePerSqFeet();
		}
		
	}

}
