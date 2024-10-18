package W07_JVP_Package;

public class car4
{
	int gas;
	
	void setgas(int gas)
	{
		this.gas = gas;
	}
	
	boolean isleftgas()
	{
		if(gas ==0)
		{
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run()
	{
		while(true)
		{
			if(gas > 0)
			{
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1;
			}
			
			else
			{
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;
			}
		}
	}
}
