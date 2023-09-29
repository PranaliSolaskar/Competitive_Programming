import java.util.*;
public class B_Aleksa_and_Stack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n=sc.nextInt();
            int k=5;
            for(int i=1;i<=n;i++)
            System.out.print(k+++" ");
            System.out.println();
        }
    }
}