package W05_JVP_Package;

public class W05_JVP_12_MultidimesionalArrayByNewExample
{
	public static void main(String[] args)
	{
		int[][]mathscores = new int[2][3];
		
		for(int i = 0; i < mathscores.length; i++)
		{
			for(int k = 0; k < mathscores[i].length; k++)
			{
				System.out.println("mathscores[" + i + "][" + k + "]: " + mathscores[i][k]);
			}
		}
		System.out.println();
	}
}
