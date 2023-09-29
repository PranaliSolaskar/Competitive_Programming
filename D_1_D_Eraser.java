import java.util.*;
public class D_1_D_Eraser
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            int ans=0;
            for(int j=0;j<n;j++)
            {
                if(str.charAt(j)=='B')
                {
                    ans=ans+1;
                    j=j+k-1;
                    //System.out.print(j);
                }
            }
            System.out.println(ans);
        }
    }
}
/*
8
6 3
WBWWWB
7 3
WWBWBWW
5 4
BWBWB
5 5
BBBBB
8 2
BWBWBBBB
10 2
WBBWBBWBBW
4 1
BBBB
3 2
WWW

output
2
1
2
1
4
3
4
0*/