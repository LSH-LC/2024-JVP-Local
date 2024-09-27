package W04_JVP_Package;

public class W04_11_MutiplicationTableExample
{
	public static void main(String[] args)
	{
		for(int m = 2; m <= 9; m++)
		{
			System.out.println("***" + m + "´Ü ***");
			
			for(int n = 1; n <= 9; n++)
			{
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}
