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

//Sample Input 
STDIN           Function
-----           --------
4               V = 4
6               arr[] size n = 6 (not passed, see function description parameters)
1 4 5 7 9 12    arr = [1, 4, 5, 7, 9, 12]

//Sample Output 
1
