package ch08.sec10;

public class C implements A
{
	@Override
	public void PrintState(String sVal)
	{
		System.out.println("C:Print out..." + sVal);
	}
}