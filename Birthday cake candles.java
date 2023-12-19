import java.util.Scanner;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Sop("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int maxHeight=arr[0];
        for(int i=1; i<n; i++)
        {
            if(arr[i]>maxHeight)
            {
                maxHeight=arr[i];
            }
        }
        int candlesCount=0;
        for(int count : arr)
        {
            if(count==maxHeight)
            {
                candlesCount++;
            }
        }
        System.out.println(candlesCount);
        
    }
}

//Sample Input
4
3 2 1 3

//Sample Output 
2
