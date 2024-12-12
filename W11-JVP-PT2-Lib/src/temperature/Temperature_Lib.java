package temperature;

import java.util.Scanner;

public class Temperature_Lib
{
 
public static void Temperature()
{
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("온도를 입력하세요: ");
     int t = scanner.nextInt();

     if (t > 30) {
         System.out.println("날씨가 덥다.");
     } else {
         System.out.println("날씨가 덥지 않다.");
     }

     scanner.close();
 }
}
