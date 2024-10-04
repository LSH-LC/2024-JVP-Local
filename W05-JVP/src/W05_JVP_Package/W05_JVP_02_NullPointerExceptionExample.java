package W05_JVP_Package;

public class W05_JVP_02_NullPointerExceptionExample
{
	public static void main(String[] args)
	{
		int[] intArray = null;
		intArray[0] = 10;
		
		String str1 = null;
		String str2 = null;
		
		System.out.println("str1 == str2: " + str1 == str2);
	}
}
