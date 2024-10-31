package test;

public class Accounttest {
    public static void main(String[] args) {
        Account account = new Account();

        // 잔고 설정 및 출력
        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());

        // 유효하지 않은 잔고 값 (음수)
        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());

        // 유효하지 않은 잔고 값 (최대 초과)
        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance());

        // 유효한 잔고 값
        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance());
    }
}
