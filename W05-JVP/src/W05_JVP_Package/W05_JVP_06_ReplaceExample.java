package W05_JVP_Package;

public class W05_JVP_06_ReplaceExample
{
	public static void main(String[] args)
	{
		String oldStr = "�ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�.";
		String newStr = oldStr.replace("�ڹ�","JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
