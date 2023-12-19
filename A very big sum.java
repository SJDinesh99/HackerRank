import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long sum=0;
        //System.out.println("Enter the no.of values going to store in array");
        int n=sc.nextInt();
        long[] ar=new long[n];
        
        for(int i=0; i<n; i++)
        {
            ar[i]=sc.nextLong();
            sum=sum+ar[i];
        }
        System.out.println(sum);
    }
}

//Sample Input
5
1000000001 1000000002 1000000003 1000000004 1000000005

//Output
5000000015
