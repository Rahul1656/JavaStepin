package com.ltts1;

public class SuiteACRoom extends HotelRoom
{
	private int ratePerSqFeet;

	public SuiteACRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi)
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		
	}
	public void getRatePerSqFeet()
	{
		if(hasWifi==true)
		{
		  super.calculateTariff(ratePerSqFeet+2);
		}
		else
		{
		   super.calculateTariff(ratePerSqFeet);
		}
	}
	
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}  
}
