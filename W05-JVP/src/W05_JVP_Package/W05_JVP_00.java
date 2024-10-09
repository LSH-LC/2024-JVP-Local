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

        System.out.println("1부터 20까지의 숫자를 맞춰보세요!");

        while (user != n)
        {
            System.out.print("숫자를 입력하세요: ");
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
                System.out.println(n + "를 맞추셨습니다.");
                System.out.println(num + "번만에 맞추셨습니다.");
            }
        }

        scanner.close();
	}
}