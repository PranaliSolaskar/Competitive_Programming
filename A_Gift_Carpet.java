import java.util.*;
public class A_Gift_Carpet
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int ts=0;ts<t;ts++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            //sc.nextLine(); // Consume the newline character
            
            char[][] arr = new char[n][m];

            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < m; j++) {
                    arr[i][j] = line.charAt(j);
                }
            }
            System.out.println(ts);
            String s = "vika";
            int ptr = 0;

            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    if (arr[i][j] == s.charAt(ptr)) {
                        ptr++;
                        if (ptr == 4) {
                            System.out.println("YES");
                            return;
                        }
                        break;
                    }
                }
            }

            if (ptr == 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}