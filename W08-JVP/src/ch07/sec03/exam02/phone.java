package ch07.sec03.exam02;

public class phone
{
	public String model;
	public String color;
	
	public phone(String model, String color)
	{
		this.model = model;
		this.color = color;
		System.out.println("phone(String model, String color) 생성자 실행");
	}
}
