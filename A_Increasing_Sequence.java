import java.util.*;
public class A_Increasing_Sequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n = sc.nextInt();
            int x = 1;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (x == a) {
                    x++;
                }
                x++;
            }
            System.out.println(x - 1);
        }
    }
}