package W07_JVP_Package;
import java.util.Scanner;

public class pp_01_class {
    // �޼ҵ�: 1���� 20������ ������ �Է¹޾� ����
    public int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.print("1���� 20������ ������ �Է��ϼ���: ");
            num = scanner.nextInt();

            if (num >= 1 && num <= 20) {
                return num; // ��ȿ�� ���ڸ� ����
            } else {
                System.out.println("�߸��� �Է��Դϴ�. �ٽ� �õ��ϼ���.");
            }
            scanner.close();
        }
    }
}