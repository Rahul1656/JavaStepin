package com.ltts;

import java.util.Scanner;
public class Main 
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		String ch1;
		String system;
		int no_doors;
		System.out.println("1. Four Wheele\n2. Two Wheeler \n");
		//ch=sc.nextInt();
		System.out.println("Enter Vehicle Type:");
		ch=sc.nextInt();
		System.out.println("Fuel Type:");
		System.out.println("1. Petrol\n2. Diesel \n");
		ch1=sc.next();
		
		if(ch==1) 
		{
		  System.out.println("Audio system:");
		  system=sc.next();
		  System.out.println("Number of doors:");
		  no_doors=sc.nextInt();
		  FourWheeler f=new FourWheeler("Volvo","TN01BR9689",ch1,40,1960);
		  f.setAudioSystem(system);
		  f.setNumberOfDoors(no_doors);
		  f.displayDetailInfo();
		}

		else if(ch==2)
		{
		  TwoWheeler t=new TwoWheeler("Suzuki","TN60Z1234","ch1",15,150);
		  t.setKickStartAvailable(true);
		  
		  t.displayDetailInfo();
		    
		}
	}

}
