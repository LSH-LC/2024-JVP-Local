package ch11.sec07.Test;

public class NotExistIDException extends Exception
{
	public NotExistIDException()
	{
		
	}
	
	public NotExistIDException(String message)
	{
		super(message);
	}
}
