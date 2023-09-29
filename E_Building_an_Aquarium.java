import java.util.*;
public class E_Building_an_Aquarium
{
    public static boolean  check(long cur, ArrayList<Integer> v1, int w)
    {
        long cnt = 0;
        int n = v1.size();
        for (int i = 0; i < n; i++) {
            cnt += Math.max(0, cur - v1.get(i));
        }
        if (cnt <= w) return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n=sc.nextInt();
            int w=sc.nextInt();
            ArrayList<Integer> v1=new ArrayList<>(n);
            for(int i=0;i<n;i++)
            {
                v1.add(sc.nextInt());
            }
            long lo=0 , hi=10000000000L , ans=0;
            while(lo<=hi)
            {
                long mid=(lo+hi)/2;
                if(check(mid,v1,w))
                {
                    ans=Math.max(mid,ans);
                    lo=mid+1;
                }
                else
                {
                    hi=mid-1;
                }
            }
            System.out.println(ans);
        }
    }
}