package ch08.sec10_2;

public class Bus implements Vehicle
{
	int iNo = 0;
	
	@Override
	public void run()
	{
		iNo++;
		System.out.println("������ �޸��ϴ�." + iNo);
	}
	
	public void checkFare()
	{
		System.out.println("��������� üũ�մϴ�.");
	}
}
