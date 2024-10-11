package W06_JVP_Package;
import java.util.Scanner;

public class W06_JVP_02_pp_2
{
	public static void main(String[] args)
	{
		int ivalue1 = 0;
		int ivalue2 = 0;
		int ivalue3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insert 1 ~ 10 value: ");
		ivalue1 = sc.nextInt();
		System.out.println("insert 1 ~ 10 value: ");
		ivalue2 = sc.nextInt();
		System.out.println("insert 1 ~ 10 value: ");
		ivalue3 = sc.nextInt();
		
		sc.close();
		
		int first = ivalue1 > ivalue2 && ivalue1 > ivalue3 ? ivalue1 : (ivalue2 > ivalue3 ? ivalue2 : ivalue3);
		int third = ivalue1 < ivalue2 && ivalue1 < ivalue3 ? ivalue1 : (ivalue2 > ivalue3 ? ivalue3 : ivalue2);
		int second = (ivalue1 < first && ivalue1 > third) ? ivalue1 : (ivalue2 < first && ivalue2 > third) ? ivalue2 : ivalue3;
		
		System.out.println("first:" + first + ", second:" + second + ", third:" + third);
	}
}
