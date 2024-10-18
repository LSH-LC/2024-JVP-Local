package W07_JVP_Package;

public class calculator3
{
	void poweron()
	{
		System.out.println("전원을 켭니다.");
	}
	
	void poweroff()
	{
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y)
	{
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y)
	{
		double result = (double)x / (double)y;
		return result;
	}
}