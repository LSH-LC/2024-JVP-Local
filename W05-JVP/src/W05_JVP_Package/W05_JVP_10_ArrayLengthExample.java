package W05_JVP_Package;

public class W05_JVP_10_ArrayLengthExample
{
	public static void main(String[] args)
	{
		int[] scores = {84,90,96};
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("Æò±Õ: " +avg);
	}
}