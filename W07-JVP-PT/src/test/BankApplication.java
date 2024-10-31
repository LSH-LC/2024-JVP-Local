package test;

import java.util.Scanner;

public class BankApplication {
    private BankAccount[] accounts;
    private int count;

    public BankApplication() {
        accounts = new BankAccount[100]; // 최대 100개의 계좌
        count = 0;
    }

    public void addAccount(String accountNumber, String accountHolder, double balance) {
        if (count < accounts.length) {
            accounts[count++] = new BankAccount(accountNumber, accountHolder, balance);
            System.out.println("결과: 계좌가 생성되었습니다.");
        } else {
            System.out.println("더 이상 계좌를 추가할 수 없습니다.");
        }
    }

    public void showAccounts() {
        System.out.println("계좌 목록:");
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankApplication bankApp = new BankApplication();

        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    double balance = Double.parseDouble(scanner.nextLine());

                    bankApp.addAccount(accountNumber, accountHolder, balance);
                    break;

                case 2:
                    bankApp.showAccounts();
                    break;

                case 3:
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    String depositAccountNumber = scanner.nextLine();
                    BankAccount depositAccount = bankApp.findAccount(depositAccountNumber);
                    if (depositAccount != null) {
                        System.out.print("예금액: ");
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("해당 계좌가 존재하지 않습니다.");
                    }
                    break;

                case 4:
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");
                    System.out.print("계좌번호: ");
                    String withdrawAccountNumber = scanner.nextLine();
                    BankAccount withdrawAccount = bankApp.findAccount(withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("출금액: ");
                        double withdrawAmount = Double.parseDouble(scanner.nextLine());
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("해당 계좌가 존재하지 않습니다.");
                    }
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
