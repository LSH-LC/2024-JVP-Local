package W05_JVP_Package;

public class W05_JVP_00_RV
{
	public static void main(String[] args)
	{
		for(int i = 0;i <= 10; i++)
		{
			for(int j = 10; j > i; j--)
			{
				System.out.print(" ");
			}
			
			for(int n = 0; n < i; n++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = 1; i < 10; i++)
		{	
			int n = 0;
			while(true)
			{
				System.out.print(" ");
				n++;
				if(i == n) {break;}
			}
			
			for(int j = 0; j < 10-i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
