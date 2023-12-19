import java.util.*;

class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //Enter the no.of string that you are going to enter
        int n=sc.nextInt();
        //Enter the string value
        for(int i=0; i<n; i++)
        {
            String s=sc.next();
            int deletions=0;
            for(int j=1; j<s.length(); j++)
            {
                if(s.charAt(j-1)==s.charAt(j))
                {
                    deletions++;
                }
            }
            System.out.println(deletions);
        }
    }
}
