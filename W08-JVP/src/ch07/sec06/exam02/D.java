package ch07.sec06.exam02;

import ch07.sec06.exam01.A;

public class D extends A
{
	public D()
	{
		super();
	}
	
	public void method1()
	{
		this.field = "value";
		this.method();
	}
	
	public void method2()
	{}
}
