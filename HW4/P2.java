
public class P2 {

	public static void Fibonachi(int x)
	{
		int a=1;
		int b=1;
		int c;
		System.out.print(a+" "+b+" ");
		for (int i=2;i<x;i++)
		{
			c=a;
			a=a+b;
			b=c;
			System.out.print(a+" ");
		}
		
	}
	
	public static void main(String[] args) {
		Fibonachi(11);
	}

}
