package ch07.sec04.exam02;

public class supersonicairplane extends airplane
{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	@Override
	public void fly()
	{
		if(flymode == SUPERSONIC)
		{
			System.out.println("�����Ӻ����մϴ�.");
		}
		else
		{
			super.fly();
		}
	}
}
