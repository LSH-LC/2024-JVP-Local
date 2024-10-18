package W07_JVP_Package;

public class W07_JVP_06_06
{
	public static void main(String[] args)
	{
		korean k1 = new korean("123456-1234567", "±èÀÚ¹Ù");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		k1.name = "±èÀÚ¹Ù";
	}
}
