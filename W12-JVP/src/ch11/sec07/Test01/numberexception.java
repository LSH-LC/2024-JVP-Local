package ch11.sec07.Test01;

import java.util.Scanner;

public class numberexception
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("���ڸ� �Է��ϼ���: ");
        String input = scanner.nextLine();
        
        try
        {
            int number = Integer.parseInt(input);
            System.out.println("�Է��� ���ڴ�: " + number);
        } 
        
        catch (NumberFormatException e)
        {
            System.out.println("���� �ƴ�!!");
        }
        
        finally
        {
            scanner.close();
        }
    }
}
