import java.util.*;
public class C_Vasilije_in_Cacak
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            long n=sc.nextLong();
            long a=sc.nextLong();
            long h=sc.nextLong();
            if(a*(a+1)/2 > h || (n-a+1+n)*a/2 <h){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}