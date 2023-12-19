import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Enter the number of strings that you are going to enter
        int no = sc.nextInt();
        // Enter the strings that you are going to enter
        String[] s1 = new String[no];

        for (int i = 0; i < no; i++)
        {
            s1[i] = sc.next();
        }

        for (int i = 0; i < no; i++)
        {
            int dollar = 0;
            String currentString = s1[i];
            String s2 = "";
            for (int j = 0; j < currentString.length(); j++)
            {
                char ch = currentString.charAt(j);
                if (!s2.contains(String.valueOf(ch))) // Check if s2 does not contain the current character
                {
                    s2 = s2 + ch;
                    dollar++;
                }
            }
            System.out.println(dollar);
        }
    }
}

//Sample Input
2
abcd
abab

//Sample Output
4
2
