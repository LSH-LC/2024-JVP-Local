package W07_JVP_Package;

public class W07_JVP_06_01
{	
	public static void main(String[] args)
	{
		car mycar = new car();
		
		System.out.println("����ȸ��: " + mycar.company);
		System.out.println("�𵨸�: " + mycar.model);
		System.out.println("����: " + mycar.color);
		System.out.println("�ְ�ӵ�: " + mycar.maxspeed);
		System.out.println("����ӵ�: " + mycar.speed);
		
		mycar.speed = 60;
		System.out.println("������ �ӵ�: " + mycar.speed);
	}
}