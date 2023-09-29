import java.util.*;
import java.lang.Math;

public class D_Balanced_Round
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n=sc.nextInt();
			int k=sc.nextInt();
			int[] arr=new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			int max=0;
			for (int i = 1,j=0; i <= n; i++) {
				if(n==i||arr[i]-arr[i-1]>k) {
					max=Math.max(max, i-j);
					j=i;
				}
			}
			System.out.println(n-max);
        }
    }
}