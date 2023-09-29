import java.util.*;
import java.lang.Math;

public class A_Tales_of_a_Sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
            int ans=0;
            for(int i=1;i<n;i++)
            {
                if(arr[i]<arr[i-1])
                {
                    ans=Math.max(ans,arr[i-1]);
                }
            }
            System.out.println(ans);
        }
    }
}