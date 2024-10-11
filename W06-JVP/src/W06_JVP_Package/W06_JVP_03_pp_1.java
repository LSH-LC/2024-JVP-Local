package W06_JVP_Package;

public class W06_JVP_03_pp_1
{
	public static void main(String[] args)
	{
		int ivalue1 = 5;
		int ivalue2 = 8;
		int ivalue3 = 3;
		int iRsitVal = (ivalue1++) + (++ivalue2) % (--ivalue3) / 2 + 4;
		
		System.out.println(iRsitVal);
	}
}
