package W06_JVP_Package;

public class W06_JVP_03_pp_2
{
	public static void main(String[] args)
	{
		int apple = 573;
		
		int used_box = apple / 12 + 1;
		int empty_box = 100 - used_box;
		
		System.out.println("apple:" + apple);
		System.out.println("used box:" + used_box);
		System.out.println("empty box:" + empty_box);
	}
}
