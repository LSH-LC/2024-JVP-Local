package W05_JVP_Package;

public class W05_JVP_08_ArrayCreateByValueListExample1
{
	public static void main(String[] args)
	{
		String[] season = { "spring","summer","fall","winter"};
		
		System.out.println("season[0]:" + season[0]);
		System.out.println("season[1]:" + season[1]);
		System.out.println("season[2]:" + season[2]);
		System.out.println("season[3]:" + season[3]);
		
		season[1] = "¿©¸§";
		System.out.println("season[1]:" + season[1]);
		System.out.println();
		
		int[] scores = {83,90,87};
		
		int sum = 0;
		for(int i=0;i<3;i++)
		{
			sum +=scores[i];
		}
		
		System.out.println("ÃÑÇÕ:" + sum);
		double avg = (double)sum/3;
		System.out.println("Æò±Õ:" + avg);
	}
}
