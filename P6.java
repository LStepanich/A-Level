import java.util.Random;

public class P6 {

	public static int[][] Creator()
	{
		int[][] m = new int[7][4];
		Random r = new Random();
		for (int i=0; i<7; i++)
		{
			for (int j=0; j<4; j++)
			{
				m[i][j] = r.nextInt(11)-5;
				if (m[i][j]<0)
				{
					System.out.print(" " + m[i][j]);
				}
				else System.out.print("  " + m[i][j]);
			}
			System.out.println();
		}
		return m;
	}
	
	public static int Check (int[][] m)
	{
		int number=0;
		int counter;
		int chek=-1;
		for (int i=0; i<7; i++)
		{
			counter = 1;
			for (int j=0; j<4; j++)
			{
				counter*=Math.abs(m[i][j]);
			}
			if (counter>chek)
			{
				chek=counter;
				number=i;
			}
		}
		return number;
	}
	
	public static void main(String[] args) {
		System.out.println(Check(Creator()));		

	}

}
