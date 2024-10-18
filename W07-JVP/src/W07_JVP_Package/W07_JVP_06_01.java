package W07_JVP_Package;

public class W07_JVP_06_01
{	
	public static void main(String[] args)
	{
		car mycar = new car();
		
		System.out.println("제작회사: " + mycar.company);
		System.out.println("모델명: " + mycar.model);
		System.out.println("색깔: " + mycar.color);
		System.out.println("최고속도: " + mycar.maxspeed);
		System.out.println("현재속도: " + mycar.speed);
		
		mycar.speed = 60;
		System.out.println("수정된 속도: " + mycar.speed);
	}
}