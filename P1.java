
import java.util.Scanner;

public class P1 {

	public static int Counter(int i)
	{
		int counter = 0;
		int a = 1;
		while (i/a>0)
		{
			counter += (i/a)%10;
			a*=10;			
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int sumOfNumbers = Counter(number);
		System.out.println(sumOfNumbers);
	}

}
