package ch08.review;

public class review2
{
	public static void main(String[] args)
	{
		int max = 0;
		int min = 100;
		int num[] = new int[10];
		
		// 중복되지 않는 정수 10개 생성
		for(int i = 0; i < 10; i++)
		{
			num[i] = (int)(Math.random()*100 +1);
			
			//중복확인
			for(int j = 0; j <= i; j++)
			{
				//같은 자리 배열 비교 넘기기
				if(i != j)
				{
					//다른 자리 배열 비교
					if(num[i] == num[j])
					{
						i--;
						break;		//같으면 그 자리의 수 재설정
					}
				}
			}
			
			
		}
		
		//최대 최소 값 구하기
		for(int i = 0; i < 10; i++)
		{
			max = max > num[i] ? max : num[i];
			min = min < num[i] ? min : num[i];
		}
		System.out.println("최대 값: " + max);
		System.out.println("최소 값: " + min);
	}
}