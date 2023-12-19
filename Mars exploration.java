import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if the character deviates from the "SOS" pattern
            if ((i % 3 == 0 && ch != 'S') || (i % 3 == 1 && 
            ch != 'O') || (i % 3 == 2 && ch != 'S')) {
                count++;
            }
        }

        System.out.println(count);
    }
}
