package review;

import java.util.Scanner;

public class calculator
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("�� ���� ������ �Է��Ͻÿ� : ");
			int x = scanner.nextInt();
			String z = scanner.next();
			int y = scanner.nextInt();
			
			if(z.equals("q"))
			{
				break;
			}
			
			switch (z)
			{
			case "+":
				System.out.println(x + " + " + y + " = " + (x + y));
				break;
			
			case "-":
				System.out.println(x + " - " + y + " = " + (x - y));
				break;
			
			case "*":
				System.out.println(x + " * " + y + " = " + (x * y));
				break;
				
			case "/":
				System.out.println(x + " / " + y + " = " + (x / y));
				break;
				
			case "%":
				System.out.println(x + " % " + y + " = " + (x % y));
				break;
				
			default:
				System.out.println("���� ��ȣ�� Ʋ�Ƚ��ϴ�.");
				break;
			}
		}
		scanner.close();
	}
}