import java.util.*;
public class B_Sets_And_Union
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n = sc.nextInt();
            long[] mask = new long[n];
            long total = 0;
            for (int j = 0; j < n; j++) {
                int cnt = sc.nextInt();
                long m = 0;
                for (int k = 0; k < cnt; k++) {
                    m |= (1L << (sc.nextInt() - 1));
                }
                mask[j] = m;
                total |= m;
            }
            int ans = 0;
            total = Long.bitCount(total);
            for (int j = 0; j < 50; j++) {
                long tmp = 0;
                for (long m : mask) {
                    if ((m >> j & 1) == 0) {
                        tmp |= m;
                    }
                }
                if (Long.bitCount(tmp) < total) {
                    ans = Math.max(ans, Long.bitCount(tmp));
                }
            }
            System.out.println(ans);
        }
    }
}