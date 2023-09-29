import java.util.scanner;

public class C_1_Dual_Easy_Version
{
    class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            ArrayList<Pair> nums = new ArrayList<>();

            for(int k=0;k<n;k++)
            {
                arr[k]=sc.nextInt();
                    
            }
        }
    }
}