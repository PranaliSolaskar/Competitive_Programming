import java.util.*;
public class B_The_Corridor_or_There_and_Back_Again
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n=sc.nextInt();
            //ArrayList<Pair<Integer,Integer>> v1=new ArrayList<>();
            int minm=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                 int k = a * 2 + b - 1;
                minm = Math.min(k, minm);
            }
            System.out.println(Math.max(1, minm / 2));
        }
    }
}