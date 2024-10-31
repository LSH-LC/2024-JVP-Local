package Week3_JVP_Package;

public class W3_8_LogicaloperatorExample
{
	public static void main(String[] args)
	{
		int charcode = 'A';
		
		if((65 <= charcode) & (charcode <= 90))
		{
			System.out.println("대문자이군요.");
		}
		
		if((97 <= charcode) && (charcode <= 122))
		{
			System.out.println("소문자이군요.");
		}
		
		if((48 <= charcode) && (charcode <= 57))
		{
			System.out.println("0~9 숫자이군요.");
		}
		
		//-------------------------------------------------------
		
		int value = 6;
		
		if((value % 2 == 0) | (value % 3 == 0))
		{
			System.out.println("2 또는 3의 배수이군요.");
		}
		
		boolean result = (value % 2 == 0) || (value % 3 == 0);
		
		if(!result)
		{
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}
}
