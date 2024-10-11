package W06_JVP_Package;

public class W06_JVP_02_PP_1
{
	public static void main(String[] args)
	{
		int ivalue1 = 5;
		int ivalue2 = 8;
		
		System.out.println(ivalue1);
		System.out.println(ivalue2);
		
		System.out.println("Change Value----------------------------");
		
		int itemp = 0;
		itemp = ivalue1;
		ivalue1 = ivalue2;
		ivalue2 = itemp;
		
		System.out.println(ivalue1);
		System.out.println(ivalue2);
	}
}
