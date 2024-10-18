package W07_JVP_Package;

public class W07_JVP_review2
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