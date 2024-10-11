package W06_JVP_Package;

public class W06_JVP_04_pp_3
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 13; i ++)
		{
			for(int x = 0; x <= i; x++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j < 25-2*i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}