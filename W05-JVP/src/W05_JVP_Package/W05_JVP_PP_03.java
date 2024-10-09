package W05_JVP_Package;

public class W05_JVP_PP_03
{
	public static void main(String[] args)
	{
		boolean bExist7 = false;
		int iTotcnt = 10;
		Integer[] arrRandomVal = new Integer[iTotcnt];
		
		for(int i = 0; i < iTotcnt; i++)
		{
			arrRandomVal[i] = (int)(Math.random()*10)+1;
			System.out.print(arrRandomVal[i]);
		}
		System.out.println("");
		
		for(int i = 0; i < iTotcnt; i++)
		{
			if(arrRandomVal[i] == 7)
			{
				System.out.println("7 is " + (i+1) + "th Number.");
				bExist7 = true;
				break;
			}
		}
		if(!bExist7)
		{
			System.out.println("Ther is no 7 Number.!!!!");
		}
	}
}
