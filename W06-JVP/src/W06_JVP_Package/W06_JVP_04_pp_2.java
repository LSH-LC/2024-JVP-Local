package W06_JVP_Package;

public class W06_JVP_04_pp_2
{
	public static void main(String[] args)
	{
		for(int i = 10; i > 0; i--)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(" ");
			}
			
			for(int x = 0; x < 11-i; x++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		
		for(int i = 0; i < 11; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(" ");
			}
			
			for(int x = 0; x < 11-i; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
