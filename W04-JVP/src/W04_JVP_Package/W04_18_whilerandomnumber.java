package W04_JVP_Package;
import java.util.Scanner;

public class W04_18_whilerandomnumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = (int)(Math.random()*10) + 1;
        int user = 0;

        System.out.println("1���� 10������ ���ڸ� ���纸����!");

        while (user != n)
        {
            System.out.print("���ڸ� �Է��ϼ���: ");
            user = scanner.nextInt();

            if (user < n)
            {
                System.out.println("UP");
            }
            
            else if (user > n)
            {
                System.out.println("DOWN");
            }
            
            else
            {
                System.out.println("Bingo!" + n + "�� ���߼̽��ϴ�.");
            }
        }

        scanner.close();
	}
}