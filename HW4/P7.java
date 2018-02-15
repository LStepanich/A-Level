package HW4;

import java.util.Random;

public class P7 {
    public static int[] Sort(int[] m)
    {
        boolean check=false;
        int a;
        for (int i=0; i<m.length-2; i++)
        {
            if(m[i]>m[i+1])
            {
                a = m[i];
                m[i]=m[i+1];
                m[i+1]=a;
                check=true;
                m[m.length-1]++;
            }
        }
        if (check==true)
        {
            m=Sort(m);
        }
        return m;
    }


    public static void main(String[] args) {
        Random random = new Random();
        int n = 5; // number of elements in massive
        int[] m = new int[n+1];
        m[n]=0;
        for (int i = 0; i < n; i++)
        {
            m[i]=random.nextInt(90)+10;
            System.out.print(m[i]+ " ");
        }
        m=Sort(m);
        System.out.println();
        for (int i = 0; i < n+1; i++)
        {
            //m[i]=random.nextInt(90)+10;
            System.out.print(m[i]+ " ");
        }

    }
}
