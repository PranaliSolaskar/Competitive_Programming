import java.util.Scanner;

public class A_Dalton_the_Teacher
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int count=0;
            for(int k=0;k<n;k++)
            {
                arr[k]=sc.nextInt();
                if(arr[k]==k+1)
                    count++;
            }
            if(count==0)
                System.out.println("0");
            else if(count%2==0)
                System.out.println(count/2);
            else 
                System.out.println((count/2)+1);            
        }
    }
}