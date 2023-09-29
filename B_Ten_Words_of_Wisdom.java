import java.util.Scanner;
import java.lang.Math;

public class B_Ten_Words_of_Wisdom
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n=sc.nextInt();
            int maxa=0,maxb=0,ans=0;
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(a<=10 && maxb<b)
                {
                    maxa=a;maxb=b;ans=i+1;
                }
            }
            System.out.println(ans);
        }
    }
}