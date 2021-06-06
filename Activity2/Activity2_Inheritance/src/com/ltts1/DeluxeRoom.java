package com.ltts1;

public class DeluxeRoom extends HotelRoom
{
	public DeluxeRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
	}

	protected int ratePerSqFeet;


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
