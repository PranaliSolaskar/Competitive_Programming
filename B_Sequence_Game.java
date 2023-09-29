import java.util.*;
public class B_Sequence_Game
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            ArrayList<Integer> v1=new ArrayList<>();
            v1.add(arr[0]);
            for(int i=1;i<n;i++)
            {
                if(arr[i]<arr[i-1])
                {
                    v1.add(arr[i]);
                }
                v1.add(arr[i]);
            }

            System.out.println(v1.size());
            for(int it:v1)
                System.out.print(it+" ");
            System.out.println();
        }
    }
}