package model;

public class Flamingo
{
	//Declaration Section---
	private String name;
	private double legCount;
	private int armCount;
	private double howTall;
	//-----------------------
	/**
	 * Default constructor for a run
	 * Initializes all variables to valid but "bad" values
	 * used for later customization
	 */
	public Flamingo()
	{
		//constructor default
	}
	/**
	 * Initializes a name 
	 * @param name or the run
	 */
	
	public Flamingo(String name)
	{
		this.name = name;
	}
	public Flamingo(String name, double legCount, int armCount, double howTall)
	{
		this.name = name;
		this.legCount = legCount;
		this.armCount = armCount;
		this.howTall = howTall;
		
	}
	public String getName()
	{
		return name;
	}
	public double getLegCount()
	{
		return legCount;
	}
	public int getArmCount()
	{
		return armCount;
	}
	public double getHowTall()
	{
		return howTall;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	public void howTall(double howTall)
	{
		this.howTall = howTall;
	}
	
}
