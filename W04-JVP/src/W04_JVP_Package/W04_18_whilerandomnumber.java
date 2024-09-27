package W04_JVP_Package;
import java.util.Scanner;

public class W04_18_whilerandomnumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = (int)(Math.random()*10) + 1;
        int user = 0;

        System.out.println("1부터 10까지의 숫자를 맞춰보세요!");

        while (user != n)
        {
            System.out.print("숫자를 입력하세요: ");
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
                System.out.println("Bingo!" + n + "를 맞추셨습니다.");
            }
        }

        scanner.close();
	}
}