import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        //System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        //System.out.println("Enter the no. of values for array");
        int[] a1=new int[n];
        for(int i=0; i<n; i++)
        {
          a1[i]=sc.nextInt();
          sum=sum+a1[i];
        }
        System.out.println(sum);
    }
}

//Sample Input
6
1 2 3 4 10 11

//Sample Output
31
