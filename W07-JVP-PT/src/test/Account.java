package test;

public class Account
{
    // 잔고의 최소 및 최대 값 상수 정의
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1_000_000;

    // 잔고 필드
    private int balance;

    // 기본 생성자
    public Account()
    {
        this.balance = MIN_BALANCE; // 초기 잔고를 0으로 설정
    }

    // Getter 메소드
    public int getBalance()
    {
        return balance;
    }

    // Setter 메소드
    public void setBalance(int balance)
    {
        // 잔고가 유효한지 체크
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE)
        {
            System.out.println();
            this.balance = balance;
        } 

        else
        {
            System.out.println();
            System.out.println("유효하지 않은 잔고 값입니다. 잔고를 변경하지 않습니다.");
        }
    }
}
