import java.util.*;
import java.util.Arrays;
class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Sop("Enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        //Sop("Enter the values of the array");
        for(int i=0; i<size; i++)
        {
            if(sc.hasNextInt())
            {
            arr[i]=sc.nextInt();
            }
        }
        Arrays.sort(arr);
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
