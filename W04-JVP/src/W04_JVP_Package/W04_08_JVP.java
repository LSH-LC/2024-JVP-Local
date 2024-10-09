package W04_JVP_Package;

public class W04_08_JVP {
    public static void main(String[] args)
    {
        int month = (int)(Math.random() * 12) + 1;
        System.out.println(month + "월");

        switch(month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31일");
                break;
                
            case 2:
                System.out.println("28일");
                break;
                
            case 4: case 6: case 9: case 11:
                System.out.println("30일");
                break;
                
            default:
                System.out.println("유효하지 않은 월");
        }
    }
}
