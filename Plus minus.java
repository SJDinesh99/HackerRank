import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Sop("Enter the size of array");
        int n=sc.nextInt();
        //Sop("Enter the values of array");
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int possCount=0;
        int negCount=0;
        int zeroCount=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]>0)
            {
                possCount++;
            }
            else if(arr[i]<0)
            {
                negCount++;
            }
            else
            {
                zeroCount++;
            }
        }
        double possRatio=(double)possCount/n;
        double negRatio=(double)negCount/n;
        double zeroRatio=(double)zeroCount/n;
        System.out.println(possRatio);
        System.out.println(negRatio);
        System.out.println(zeroRatio);
    }
}

//Sample Input
STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

//Sample Output
0.500000
0.333333
0.166667
