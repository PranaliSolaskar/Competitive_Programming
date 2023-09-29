import java.util.*;

public class B_Good_Kid
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            int lownum=Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
            int flag=0,mul=1;
            for(int j=0;j<n;j++)
            {
                if(lownum==arr[j] && flag==0)
                {
                    arr[j]+=1;
                    flag=1;
                }
                mul=mul*arr[j];
            }
            System.out.println(mul);
        }
    }
}