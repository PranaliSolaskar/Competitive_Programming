import java.util.*;
public class A_Two_Vessels
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println((int)Math.ceil((Math.max(a, b)-Math.min(a, b))*1.0/2/c));
        }
    }
}