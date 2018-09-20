package model;

public class model
{
	//Declaration Section---
	private String name;
	private int timeMinutes;
	private int timeHours;
	private double distance;
	//-----------------------
	
	public model()
	{
		//constructor default
	}
	public model(String name)
	{
		this.name = name;
	}
	public model(String name, int timeMinutes, int timeHours, double distance)
	{
		this.name = name;
		this.timeMinutes = timeMinutes;
		this.timeHours = timeHours;
		this.distance = distance;
		
	}
	public String getName()
	{
		return name;
	}
	public int getTimeMinutes()
	{
		return timeMinutes;
	}
	public int getTimeHours()
	{
		return timeHours;
	}
	public double getDistance()
	{
		return distance;
	}
	
}
