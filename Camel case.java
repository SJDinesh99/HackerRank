import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Enter the value of String;
        String s=sc.next();
        int wordCount=1;
        
        for(int i=1; i<s.length(); i++)
        {
            char currChar=s.charAt(i);
            if(Character.isUpperCase(currChar))
            {
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
}
