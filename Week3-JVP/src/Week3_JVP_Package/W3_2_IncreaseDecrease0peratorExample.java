package Week3_JVP_Package;

public class W3_2_IncreaseDecrease0peratorExample
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("---------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}