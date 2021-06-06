package com.ltts;
import java.util.Scanner;
public class main {

	public static void main(String[] args) 
	{
		int ch;
		int radius,side;
		Scanner sc=new Scanner(System.in);
		System.out.println("Circle\nSquare");
		System.out.println("Enter the shape");
		ch=sc.nextInt();
		if(ch==1)
		{
		System.out.println("Enter the radius");
		radius=sc.nextInt();
		circle c=new circle();
        c.CalculateArea(radius);
		}
		else
		{
		System.out.println("Enter the side");
		side=sc.nextInt();
        square s=new square();
        s.CalculateArea(side);
		}
 	}

}
