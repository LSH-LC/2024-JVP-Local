package W07_JVP_Package;

public class W07_JVP_06_02
{
	public static void main(String[] args)
	{
		car car2 = new car();
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxspeed : " + car2.maxspeed);
		System.out.println();
		
		car car2 = new car(저가용);
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		
		car car2 = new car(보통);
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		
		car car2 = new car(풀옵션);
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.maxspeed : " + car2.maxspeed);
	}
}
