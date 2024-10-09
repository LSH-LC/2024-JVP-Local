package W05_JVP_Package;

public class W05_JVP_05_CharAtExample
{
	public static void main(String[] args)
	{
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch(sex)
		{
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
			
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
		
		//****************************************************************
		String str = "charAtExample_Test1";
		String s1 = str.substring(12);
		System.out.println("s1: "+ s1);
		String s2 = str.substring(12,15);
		System.out.println("s2: "+ s2);
		//****************************************************************
		
		String str2 = "charAtExample_Test2";
		int a1 = str2.indexOf('E');
		System.out.println("a1: " + a1);
	}
}
