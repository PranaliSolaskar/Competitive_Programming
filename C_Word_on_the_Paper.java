import java.util.Scanner;
import java.lang.Math;

public class C_Word_on_the_Paper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            String ans="";
            for(int i=0;i<8;i++)
            {
                String str=sc.next();
                if(str!="........");
                {
                    for(int k=0;k<8;k++)
                    {
                        char ch=str.charAt(k);
                        if(ch!='.')
                        {
                            ans=ans+ch;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
        