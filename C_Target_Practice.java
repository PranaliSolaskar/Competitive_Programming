import java.util.*;
public class C_Target_Practice
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int ans=0;
            for(int i=0;i<10;i++)
            {
                String ch=sc.next();
                for(int j=0;j<10;j++)
                {
                    
                    if(ch.charAt(j)=='X')
                        ans += Math.min(Math.min(i + 1, j + 1), Math.min(10-i, 10-j)); 
                }
            }
            System.out.println(ans);    
        }
    }
}
