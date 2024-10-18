package W07_JVP_Package;

public class W07_JVP_06_04
{
	public static void main(String[] args)
	{
		car4 mycar = new car4();
		mycar.setgas(5);
		
		if(mycar.isleftgas())
		{
			System.out.println("출발합니다.");
			mycar.run();
		}
		System.out.println("gas를 주입하세요.");
	}
}
