
public class P4 {

	public static int Counter()
	{
		int counter = 0;
		for (int a=0;a<24;a++)
		{
			for (int b=0;b<60;b++)
			{
				if (((a/10)==(b%10))&&((a%10)==(b/10)))
				{
					counter++;
					//System.out.println(a/10 + "" + a%10 + ":" + b/10 + "" + b%10);
				}
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		System.out.println(Counter());
	}

}
