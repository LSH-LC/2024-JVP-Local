package test;

public class Printer    //오버로딩을 할 때에는 매개변수의 개수나 형(타입), 순서가 달라야 한다.
{
    public void println(int value)
    {
        System.out.println(value);
    }

    public void println(boolean value)
    {
        System.out.println(value);
    }

    public void println(double value)
    {
        System.out.println(value);
    }

    public void println(String value)
    {
        System.out.println(value);
    }

    //메인 메소드
    public static void main(String[] args)
    {
        Printer printer = new Printer();
        
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}