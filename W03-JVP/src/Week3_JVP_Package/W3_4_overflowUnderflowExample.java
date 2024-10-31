package Week3_JVP_Package;

public class W3_4_overflowUnderflowExample
{
	public static void main(String[] args)
	{
		byte var1 = 125;
		for(int i = 0; i < 5; i++)
		{
			var1++;
			System.out.println("var1: " + var1);
		}
		
		System.out.println("--------------------");
		
		byte var2 = -125;
		for(int i = 0; i < 5; i++)
		{
			var2--;
			System.out.println("var2: " + var2);
		}
	}
}
