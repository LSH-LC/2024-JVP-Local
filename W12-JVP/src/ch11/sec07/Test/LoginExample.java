package ch11.sec07.Test;

public class LoginExample
{
	public static void main(String[] args)
	{
		try
		{
			login("White", "12345");
		}
		
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
		try
		{	
			login("Blue", "54321");
		}
		
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException
	{
		if (!(id.equals("Blue") || id.equals("White")))
		{
			throw new NotExistIDException("���̵� Ʋ�Ƚ��ϴ�.");
		}
		
		if (!(password.equals("12345") || password.equals("54321")))
		{
			throw new WrongPasswordException("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
}
