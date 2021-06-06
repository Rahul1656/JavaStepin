package com.ltts4;

public class Employee
{
   private String name;
   private String adress;
   private String mobile;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public void displayInfo()
{
	System.out.println("Employee Details");
    System.out.println("Name:"+getName());
    System.out.println("Address:"+getAdress());
    System.out.println("Mobile:"+getMobile());
}
   
}
