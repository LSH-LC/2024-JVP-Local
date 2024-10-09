package W04_JVP_Package;

public class W04_20_BreakExample
{
	public static void main(String[] args)
	{
		while(true)
		{
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6)
			{
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
