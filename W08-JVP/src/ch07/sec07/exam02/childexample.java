package ch07.sec07.exam02;

import ch07.sec07.exam01.parent;

public class childexample
{
	public static void main(String[] args)
	{	
		parent parent = new child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		child child = (child) parent;
		
		child.field2 = "data2";
		child.method3();
	}
}
