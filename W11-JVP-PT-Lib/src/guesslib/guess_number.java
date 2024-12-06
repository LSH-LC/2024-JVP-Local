package guesslib;
import java.util.Scanner;
import java.util.Random;

public class guess_number implements guess
{
	private int targetNumber;
    private int attempts;
    private Scanner scanner;
    private Random random;

    public guess_number()
    {
        random = new Random();
        scanner = new Scanner(System.in);
        targetNumber = random.nextInt(45) + 1;  // 1 ~ 45 ������ ���� ����
        attempts = 0;
    }

    @Override
    public void start()
    {
        int guess;

        System.out.println("1���� 45 ������ ���ڸ� ���纸����!");

        while (true)
        {
            attempts++;
            System.out.print("���ڸ� �Է��ϼ���: ");
            guess = scanner.nextInt();

            if (guess < targetNumber)
            {
                System.out.println("UP");
            } 
            
            else if (guess > targetNumber)
            {
                System.out.println("DOWN");
            }
            
            else
            {
                System.out.println("RIGHT");
                System.out.println("�����մϴ�! " + attempts + "�� ���� ������ϴ�.");
                break;
            }
        }
    }
}
