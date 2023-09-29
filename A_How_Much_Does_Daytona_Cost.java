import java.util.*;
public class A_How_Much_Does_Daytona_Cost
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int flag=0;
            for(int i=0;i<n;i++)
            {
                int num=sc.nextInt();
                if(num==k)
                    flag=1;
            }
            if(flag==0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}