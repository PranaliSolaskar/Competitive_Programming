import java.util.Scanner;
import java.lang.Math;

public class A_Array_Coloring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n=sc.nextInt();
            int count=0;
            for(int i=0;i<n;i++)
            {
                int num=sc.nextInt();
                if(num%2!=0)
                    count++;
            }
            if(count%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
