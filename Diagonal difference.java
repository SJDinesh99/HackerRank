import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter one number that indicates the no.of rows and columns");
        int n=sc.nextInt();
        sc.nextLine();
        int[][] arr=new int[n][n];
        //Sop("Enter the values of the array");
         for (int i = 0; i < arr.length; i++)
        {
            String[] values = sc.nextLine().split(" ");
        for (int j = 0; j < arr[i].length; j++) 
        {
            arr[i][j] = Integer.parseInt(values[j]);
        }
}
        int left_to_right=0;
        int right_to_left=0;
        for (int i = 0; i < arr.length; i++) 
        {
            left_to_right += arr[i][i];
            right_to_left += arr[i][arr.length - 1 - i];
        }
        int difference=Math.abs(left_to_right - right_to_left);
        System.out.println(difference);
    }
}


