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
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	void run()
	{
		while(true)
		{
			if(gas > 0)
			{
				System.out.println("�޸��ϴ�.(gas�ܷ�: " + gas + ")");
				gas -= 1;
			}
			
			else
			{
				System.out.println("����ϴ�.(gas�ܷ�: " + gas + ")");
				return;
			}
		}
	}
}
