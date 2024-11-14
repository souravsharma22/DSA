
import java.util.HashSet;
import java.util.Set;

public class Q9_solution {


    public static int substring(String s) {
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // If there's a duplicate character, move the left pointer to the right
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the new character and update max length
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str = "dvdf";
        int ans = substring(str);
        System.out.println(ans); // Output should be 3
    }
}


