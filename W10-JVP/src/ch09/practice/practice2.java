package ch09.practice;

public class practice2
{
	public static void main(String[] args)
	{
		int x = 0;
		int[] y = new int[100];

		for(int i = 1; i <= 100; i++)
		{
			if(i % 7 == 0)
			{
				System.out.print(i + " ");
				y[x] = i;
				x++;
			}
		}
		System.out.println();
		System.out.println(x + "°³");
	}
}
