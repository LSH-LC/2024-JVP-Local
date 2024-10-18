package W07_JVP_Package;

public class W07_JVP_review1
{
	public static void main(String[] args)
	{
		int ival1 = 3;
		int ival2 = 7;
		int ival3 = 9;
		int ival4 = 5;
		
		int irslt = ival1++ * ++ival2 + ival3-- - --ival4;
		
		System.out.println(irslt);
	}
}
