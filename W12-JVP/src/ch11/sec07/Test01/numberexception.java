package ch11.sec07.Test01;

import java.util.Scanner;

public class numberexception
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        String input = scanner.nextLine();
        
        try
        {
            int number = Integer.parseInt(input);
            System.out.println("입력한 숫자는: " + number);
        } 
        
        catch (NumberFormatException e)
        {
            System.out.println("숫자 아님!!");
        }
        
        finally
        {
            scanner.close();
        }
    }
}
