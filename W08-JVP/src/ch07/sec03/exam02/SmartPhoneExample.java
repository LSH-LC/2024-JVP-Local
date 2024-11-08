package ch07.sec03.exam02;

import ch07.sec03.exam01.smartphone;

public class SmartPhoneExample
{
	public static void main(String[] args)
	{
		smartphone myphone = new smartphone("°¶·°½Ã", "Àº»ö");
		
		System.out.println("¸ðµ¨: " + myphone.model);
		System.out.println("»ö»ó: " + myphone.color);
	}
}
