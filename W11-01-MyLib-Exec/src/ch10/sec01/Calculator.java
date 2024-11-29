package ch10.sec01;

import ch10.sec01.plus;
import ch10.sec01.minus;

public class Calculator
{
	public static void main(String[] args)
	{
		plus ps = new plus();
		int irsltp = ps.plusmethod(7,3);
		System.out.println("1.irslt : " + irsltp);
		
		minus ms = new minus();
		int irsltm = ms.minusmethod(7, 3);
		System.out.println("2.irslt : " + irsltm);
	}
}
