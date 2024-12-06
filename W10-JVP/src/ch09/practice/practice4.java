package ch09.practice;
import java.util.Scanner;

public class practice4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("두 수의 계산식을 입력하시오 : ");
			int x = scanner.nextInt();
			String z = scanner.next();
			int y = scanner.nextInt();
			
			if(z == "q")
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
				System.out.println("연산 부호가 틀렸습니다.");
				break;
			}
		}
		scanner.close();
	}
}
