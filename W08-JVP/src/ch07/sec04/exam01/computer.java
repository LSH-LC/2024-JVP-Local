package ch07.sec04.exam01;

public class computer extends calculator
{
	@Override
	public double areacircle(double r)
	{
		System.out.println("computer ��ü�� areacircle() ����");
		return Math.PI * r * r;
	}
}
