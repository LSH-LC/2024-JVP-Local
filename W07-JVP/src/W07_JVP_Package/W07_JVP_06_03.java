package W07_JVP_Package;

public class W07_JVP_06_03
{
	public static void main(String[] args)
	{
		calculator3 mycalc = new calculator3();
		
		mycalc.poweron();
		
		int result1 = mycalc.plus(5,6);
		System.out.println("result1: " + result1);
		
		int x = 10;
		int y = 4;
		
		double result2 = mycalc.divide(x,y);
		System.out.println("result2: " + result2);
		
		mycalc.poweroff();
	}
}
