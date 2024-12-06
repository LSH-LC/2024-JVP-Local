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
        targetNumber = random.nextInt(45) + 1;  // 1 ~ 45 사이의 랜덤 숫자
        attempts = 0;
    }

    @Override
    public void start()
    {
        int guess;

        System.out.println("1부터 45 사이의 숫자를 맞춰보세요!");

        while (true)
        {
            attempts++;
            System.out.print("숫자를 입력하세요: ");
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
                System.out.println("축하합니다! " + attempts + "번 만에 맞췄습니다.");
                break;
            }
        }
    }
}
