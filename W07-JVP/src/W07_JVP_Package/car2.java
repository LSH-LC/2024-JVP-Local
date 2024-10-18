package W07_JVP_Package;

public class car2
{
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	car2() {}
	
	car2(String model)
	{
		this.model = model;
	}
	
	car2(String model, String color)
	{
		this.model = model;
		this.color = color;
	}
	
	car2(String model, String color, int maxspeed)
	{
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
