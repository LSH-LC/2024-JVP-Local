package W07_JVP_Package;

public class W07_JVP_06_05
{
	static int speed;		//static �߰�
	
	void run()
	{
		System.out.println(speed + "�� �޸��ϴ�.");
	}
	
	static void simulate()
	{
		//this.speed = 10; , car5 = W07_JVP_06_05
		speed = 20;
		
		W07_JVP_06_05 mycar = new W07_JVP_06_05();
		mycar.speed = 200;
		mycar.run();
	}

	public static void main(String[]args)
	{
		simulate();
		
		W07_JVP_06_05 mycar = new W07_JVP_06_05();
		mycar.speed = 60;
		mycar.run();
	}
}