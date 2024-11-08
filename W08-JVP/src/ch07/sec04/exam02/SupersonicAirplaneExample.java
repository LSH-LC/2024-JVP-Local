package ch07.sec04.exam02;

public class SupersonicAirplaneExample
{
	public static void main(String[] args)
	{
		supersonicairplane sa = new supersonicairplane();
		
		sa.takeoff();
		sa.fly();
		sa.flymode = supersonicairplane.SUPERSONIC;
		sa.fly();
		sa.flymode = supersonicairplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
