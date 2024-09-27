package W04_JVP_Package;

public class W04_13_Printmorestar
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 9; i++)
		{
			for(int n = 0; n < i; n++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
