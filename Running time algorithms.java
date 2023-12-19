import java.util.*;

class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //Enter the no.of int that you are going to enter
        int n=sc.nextInt();
        int[] arr=new int[n];
        //Enter the int values
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int temp=0;
        for(int i=0; i<n; i++)
        {   
            for(int j=0; j<n-i-1; j++)
            {
            if(arr[j]>arr[j+1])
            {
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            count++;
            }
            }
        }
        System.out.println(count);
    }
}
