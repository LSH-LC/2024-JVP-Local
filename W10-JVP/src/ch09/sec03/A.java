package ch09.sec03;

public class A
{
	static class SubB
	{
		int field1 = 1;
		
		static int field2 = 2;
		
		SubB()
		{
			System.out.println("B-������ ����");
		}
		
		void method1()
		{
			System.out.println("B-method1 ����");
		}
		
		static void method2()
		{
			System.out.println("B-method2 ����");
		}
	}
}
