import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int alicepoint=0;
        int bobpoint=0;
        int[] al=new int[3];
        //System.out.println("Enter the array values for alice");
        for(int i=0; i<al.length; i++)
        {
            al[i]=sc.nextInt();
        }
        
        int[] bo=new int[3];
        //System.out.println("Enter the array values for bob");
        for(int i=0; i<bo.length; i++)
        {
            bo[i]=sc.nextInt();
        }
        
        for(int i=0; i<3; i++)
        {
            if(al[i]>bo[i])
            {
                alicepoint+=1;
            }
            else if(al[i]<bo[i])
            {
                bobpoint+=1;
            }
            
        }
        System.out.print(alicepoint+" "+bobpoint);
    }
}
