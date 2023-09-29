import java.util.*;
import java.lang.Math;

public class A_Love_Story
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String str="codeforces";
        for(int ts=0;ts<t;ts++)
        {
            String n=sc.next();
            int count=0;
            for(int i=0;i<10;i++)
            {
                if(n.charAt(i)!=str.charAt(i))
                    count++;
            }
            System.out.println(count);
        }
    }
}
