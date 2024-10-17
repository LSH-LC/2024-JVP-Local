package W06_JVP_Package;

import java.util.Arrays;

public class W06_JVP_05_pp_1
{
    public static void main(String[] args)
	{
        int [] numbers = new int[10];
        int count = 0;

        while (count < 10)
		{
            int randomNum = (int)(Math.random() * 10) + 1; // 1부터 10까지의 랜덤 숫자
            boolean duplicate = false;

            for (int i = 0; i < count; i++)
			{
                if (numbers[i] == randomNum)
				{
                    duplicate = true; 					//중복되면 while문으로 나간다.
                }
            }

            if (!duplicate)								//false일 때 실행
			{
                numbers[count] = randomNum;
                count++;
            }
        }

        Arrays.sort(numbers); 								//정렬 및 출력
        for (int i = 0; i < 10; i++)							//for (int i = 9; i >= 0; i--)
		{									//{System.out.println(numbers[i]);}
            System.out.println(numbers[i]);						//내림차순 출력
        }
    }
}
