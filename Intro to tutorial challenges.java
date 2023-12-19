import java.util.*;

class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Sop("Enter the value to find the index");
        int v=sc.nextInt();
        //Sop("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        //Sop("Enter the values of the array");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i]==v)
            {
                System.out.println(i);
            }
        }
    }
}
