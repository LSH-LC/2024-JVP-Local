package W05_JVP_Package;
import java.util.Scanner;

public class W05_JVP_00
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = (int)(Math.random()*20) + 1;
        int user = 0;
        int num = 0;

        System.out.println("1���� 20������ ���ڸ� ���纸����!");

        while (user != n)
        {
            System.out.print("���ڸ� �Է��ϼ���: ");
            user = scanner.nextInt();
            num += 1;

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
                System.out.println("Bingo!");
                System.out.println(n + "�� ���߼̽��ϴ�.");
                System.out.println(num + "������ ���߼̽��ϴ�.");
            }
        }

        scanner.close();
	}
}