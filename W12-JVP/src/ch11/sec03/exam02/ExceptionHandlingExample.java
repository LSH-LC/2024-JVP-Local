package ch11.sec03.exam02;

public class ExceptionHandlingExample
{
	public static void main(String[] args) 
	{
		String[] array = {"100", "loo"};
		for(int i=0; i<=array.length; i++)
		{
			try
			{
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("�迭 �ε����� �ʰ���: " + e.getMessage());
			}
			
			catch(Exception e)
			{
				System.out.println("���࿡ ������ �ֽ��ϴ�.");
			}
		}
	}
}