package ch07.sec02;

public class smartphone extends phone
{
	public boolean wifi;
	
	public smartphone(String model, String color)
	{
		super();
		this.model = model;
		this.color = color;
	}
	
	public void setwifi(boolean wifi)
	{
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet()
	{
		System.out.println("인터넷에 연결합니다.");
	}
}
