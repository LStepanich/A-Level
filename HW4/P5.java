
import java.util.Random;

public class P5 {

	public static void Creator()
	{
		Random r = new Random();
		int[][] m = new int[8][5];
		for (int i = 0; i < 8; i++ )
		{
			for (int j = 0; j < 5; j++)
			{
				m[i][j] = r.nextInt(90) + 10;
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Creator();
	}

}
