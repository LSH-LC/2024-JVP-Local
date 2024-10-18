package W07_JVP_Package;
import java.util.Scanner;

public class pp_01_class {
    // 메소드: 1부터 20까지의 정수를 입력받아 리턴
    public int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.print("1부터 20까지의 정수를 입력하세요: ");
            num = scanner.nextInt();

            if (num >= 1 && num <= 20) {
                return num; // 유효한 숫자를 리턴
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
            scanner.close();
        }
    }
}