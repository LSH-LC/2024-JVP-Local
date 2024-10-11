package W06_JVP_Package;

public class W06_JVP_04_pp_1
{
	public static void main(String[] args)
	{
		for(int i = 2; i <= 9; i++)
		{
			if(i == 6)
			{
				continue;
			}
			
			System.out.println(i + "´Ü");
			
			for(int j = 1; j<= 9; j++)
			{
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}
