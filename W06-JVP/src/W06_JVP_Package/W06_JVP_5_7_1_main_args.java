package W06_JVP_Package;

public class W06_JVP_5_7_1_main_args
{
	public static void main(String[] args)
	{
		if(args.length != 2)
		{
			System.out.println("���α׷� �Է� ���� ����");
			System.exit(0);
		}
		
		String strnum1 = args[0];
		String strnum2 = args[1];
		
		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
