package W07_JVP_Package;
import java.util.Arrays;
public class W07_JVP_review3
{

	public static void main(String[] args)
	{
        int [] numbers = new int[10];
        int count = 0;

        while (count < 10)
		{
            int randomNum = (int)(Math.random() * 10) + 1; // 1���� 10������ ���� ����
            boolean duplicate = false;

            for (int i = 0; i < count; i++)
			{
                if (numbers[i] == randomNum)
				{
                    duplicate = true; 					//�ߺ��Ǹ� while������ ������.
                }
            }

            if (!duplicate)								//false�� �� ����
			{
                numbers[count] = randomNum;
                count++;
            }
        }

        Arrays.sort(numbers); 								//���� �� ���
        for (int i = 0; i < 10; i++)							//for (int i = 9; i >= 0; i--)
		{									//{System.out.println(numbers[i]);}
            System.out.println(numbers[i]);						//�������� ���
        }
    }
}