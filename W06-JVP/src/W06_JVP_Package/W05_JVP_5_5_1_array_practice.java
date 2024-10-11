package W06_JVP_Package;

public class W05_JVP_5_5_1_array_practice
{
	public static void main(String[] args)
	{
		int[] number = new int[10];
		for(int i = 0; i<number.length; i++)
		{
			number[i] = (int)(Math.random()*10);
			System.out.print(number[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i<number.length; i++)
		{
			if(number[i] == 7)
			{
				System.out.println(i+1 + "번 자리에 7이 있습니다.");
			}
		}
	}
}