package ch07.sec03.exam01;

public class smartphone extends phone
{
	public smartphone(String model, String color)
	{
		super();
		this.model = model;
		this.color = color;
		
		System.out.println("smartphone(String model, String color) 생성자 실행됨");
	}
}
