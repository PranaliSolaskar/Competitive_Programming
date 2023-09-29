import java.util.Scanner;
import java.lang.Math;

public class A_Escalator_Conversations
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int h=sc.nextInt();
            int count=0;
            for(int i=1;i<=n;i++)
            {
                int a=sc.nextInt();
		        int d=Math.abs(h-a);
		        if(d==0) {
		            continue;
		        }
		        int nmb=d/k;
		        if(d%k==0 && nmb<m) {
		            count++;
		        }
            }
            System.out.println(count);;
        }
    }
}
