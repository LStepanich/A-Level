
public class P3 {

	public static int Counter()
	{
		int counter = 0;
		for (int a1=0;a1<10;a1++)
		{
			for (int a2=0;a2<10;a2++)
			{
				for (int a3=0;a3<10;a3++)
				{
					for (int a4=0;a4<10;a4++)
					{
						for (int a5=0;a5<10;a5++)
						{
							for (int a6=0;a6<10;a6++)
							{
								if ((a1+a2+a3)==(a4+a5+a6))										
								{
									counter++;
									//System.out.println(a1+""+a2+""+a3+""+a4+""+a5+""+a6);
								}
							}
						}
					}
				}
			}
		}
		return counter-1;	
	}
	
	public static void main(String[] args) {
		System.out.println(Counter());
	}

}