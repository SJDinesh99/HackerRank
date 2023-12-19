import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Sop("Enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        //Sop("Enter the values of the array");
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

//Sample Input
STDIN       Function
-----       --------
5           arr[] size n =5
4 5 3 7 2   arr =[4, 5, 3, 7, 2]

//Sample Output
3 2 4 5 7
