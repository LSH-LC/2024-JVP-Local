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
		System.out.println("�������� ���¸� �����߽��ϴ�.");
	}
	
	public void internet()
	{
		System.out.println("���ͳݿ� �����մϴ�.");
	}
}
