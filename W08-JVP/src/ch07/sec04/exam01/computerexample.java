package ch07.sec04.exam01;

public class computerexample
{
	public static void main(String[] args)
	{
		int r = 10;
		
		calculator calculator = new calculator();
		System.out.println("원 면적 : " + calculator.areacircle(r));
		System.out.println();
		
		computer computer = new computer();
		System.out.println("원 면적 : " + computer.areacircle(r));
	}
}
