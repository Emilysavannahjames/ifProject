package model;

public class model
{
	//Declaration Section---
	private String name;
	private int timeMinutes;
	private int timeHours;
	private double distance;
	//-----------------------
	/**
	 * Default constructor for a run
	 * Initializes all variables to valid but "bad" values
	 * used for later customization
	 */
	public model()
	{
		//constructor default
	}
	/**
	 * Initializes a name 
	 * @param name or the run
	 */
	
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
	public void setName(String name)
	{
		this.name = name;
	}
	public void setTimeMinutes(int timeMinutes)
	{
		this.timeMinutes = timeMinutes;
	}
	public void setTimeHours(int timeHours)
	{
		this.timeHours = timeHours;
	}
	public void distance(double distance)
	{
		this.distance = distance;
	}
	
}
