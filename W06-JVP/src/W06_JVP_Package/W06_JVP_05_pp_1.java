package W06_JVP_Package;

public class W06_JVP_05_pp_1
{
	public static void main(String[] args)
	{
		int[] number = new int[10];
		int num = 0;
		int i = 0;
		
		while(true)
		{
			num = (int)(Math.random()*10)+1;
			if(number[i-1] == num)
			{
				continue;
			}
			number[i] = num;
			i++;
			
		}
	}
}
