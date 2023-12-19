import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Sop("Enter the values of the array");
        int[] arr=new int[5];
        for(int i=0; i<5; i++)
        {
            arr[i]=sc.nextInt();
        }
        long maximum=arr[0];
        long minimum=arr[0];
        long totalSum=0;
        for(int i=1; i<5; i++)
        {
            if(arr[i]>maximum)
            {
                maximum=arr[i];
            }
            if(arr[i]<minimum)
            {
                minimum=arr[i];
            }
        }
        for(int i=0; i<5; i++)
        {
            totalSum=totalSum+arr[i];
        }
        System.out.print(totalSum-maximum+" ");
        System.out.print(totalSum-minimum);
    }
}
