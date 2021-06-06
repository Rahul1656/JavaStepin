package com.ltts1;

public class DeluxeACRoom extends DeluxeRoom
{
    public DeluxeACRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
	}
	protected int ratePerSqFeet;
	public void SetratePerSqFeet(int ratePerSqFeet)
	{
		this.ratePerSqFeet=ratePerSqFeet;
		super.setRatePerSqFeet(ratePerSqFeet);
		super.getRatePerSqFeet();
	}
    
  
}
