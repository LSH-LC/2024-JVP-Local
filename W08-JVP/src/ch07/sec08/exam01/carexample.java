package ch07.sec08.exam01;

public class carexample
{
	public static void main(String[] args)
	{
		car mycar = new car();
		
		mycar.tire = new Tire();
		mycar.run();
		
		mycar.tire = new HankookTire();
		mycar.run();
		
		mycar.tire = new KumhoTire();
		mycar.run();
	}
}
