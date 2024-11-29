package ch10.practice;
import java.util.Scanner;
import java.util.Arrays;

public class practice2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] x = new int[4];
		
		for(int i = 0; i < 4; i++)
		{
			System.out.print("숫자를 입력하시오 : ");
			x[i] = scanner.nextInt();
		}
		
		Arrays.sort(x);
		
		for(int j = 3; j >= 0; j--)
		{
			System.out.print(x[j] + " ");
		}
		scanner.close();
	}
}
