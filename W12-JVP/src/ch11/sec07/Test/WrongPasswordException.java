package ch11.sec07.Test;

public class WrongPasswordException extends Exception
{
	public WrongPasswordException()
	{
		
	}
	
	public WrongPasswordException(String message)
	{
		super(message);
	}
}
