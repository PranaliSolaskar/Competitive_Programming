class Recursive_Digit_Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.next();
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<n.length();i++)
        {
            sum=(int)n.charAt(0);
        }
        int supersum=sum*k;
        System.out.print(supersum);
        sum=0;
        while(supersum>10)
        {
            int rem=supersum%10;
            sum=sum+rem;
            supersum=sum;
        }
         System.out.print(supersum);
    }
}