package W05_JVP_Package;

public class W05_JVP_07_SplitExample
{
	public static void main(String[] args)
	{
		String board = "1,�ڹ� �н�,���� Ÿ�� String�� �н��մϴ�.,ȫ�浿";
		
		String[]tokens = board.split(",");
		
		System.out.println("��ȣ: " + tokens[0]);
		System.out.println("����: " + tokens[1]);
		System.out.println("����: " + tokens[2]);
		System.out.println("����: " + tokens[3]);
		System.out.println();
		
		for(int i = 0; i < tokens.length; i++)
		{
			System.out.println(tokens[i]);
		}
	}
}
