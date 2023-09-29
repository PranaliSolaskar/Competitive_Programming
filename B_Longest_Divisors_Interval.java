import java.util.Scanner;

public class B_Longest_Divisors_Interval
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long n=sc.nextLong();
            int count=1;
            for(long k=2;k<=n;k++)
            {
                if(n%k==0)
                    count++;
                else
                    break;
            }
            System.out.println(count);
        }   
    }
}
