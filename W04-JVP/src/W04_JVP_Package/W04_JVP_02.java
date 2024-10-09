package W04_JVP_Package;
import java.util.Scanner;

public class W04_JVP_02
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수값 입력: ");
        int iFstVal = scanner.nextInt();

        System.out.print("두 번째 정수값 입력: ");
        int iSecVal = scanner.nextInt();
        
        System.out.println("input iFstVal = " + iFstVal);
        System.out.println("input iSecVal = " + iSecVal);

        int largerVal = (iFstVal > iSecVal) ? iFstVal : iSecVal;
        int smallerVal = (iFstVal > iSecVal) ? iSecVal : iFstVal;
        System.out.println("output largerVal = " + largerVal);
        System.out.println("output smallerVal = " + smallerVal);
        
        scanner.close();
	}
}