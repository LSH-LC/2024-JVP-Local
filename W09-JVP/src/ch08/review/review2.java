package ch08.review;

public class review2
{
	public static void main(String[] args)
	{
		int max = 0;
		int min = 100;
		int num[] = new int[10];
		
		// �ߺ����� �ʴ� ���� 10�� ����
		for(int i = 0; i < 10; i++)
		{
			num[i] = (int)(Math.random()*100 +1);
			
			//�ߺ�Ȯ��
			for(int j = 0; j <= i; j++)
			{
				//���� �ڸ� �迭 �� �ѱ��
				if(i != j)
				{
					//�ٸ� �ڸ� �迭 ��
					if(num[i] == num[j])
					{
						i--;
						break;		//������ �� �ڸ��� �� �缳��
					}
				}
			}
			
			
		}
		
		//�ִ� �ּ� �� ���ϱ�
		for(int i = 0; i < 10; i++)
		{
			max = max > num[i] ? max : num[i];
			min = min < num[i] ? min : num[i];
		}
		System.out.println("�ִ� ��: " + max);
		System.out.println("�ּ� ��: " + min);
	}
}