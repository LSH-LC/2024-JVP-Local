package ch07.sec05;

public class car
{
	public int speed;
	
	public void speedup()
	{
		speed += 1;
	}
	
	public final void stop()
	{
		System.out.println("���� ����");
		speed = 0;
	}
}
