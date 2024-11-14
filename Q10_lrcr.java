import java.util.HashMap;

public class Q10_lrcr {
    public static  int characterReplacement(String s, int k) {
        int count =0;
        int l=0;
        int ans =0;
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r),0)+1);
            count = Math.max(count,hm.get(s.charAt(r)));
            if((r-l+1)-count>k)
            {
                hm.put(s.charAt(l), hm.get(s.charAt(l))-1);
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "AABABBA";
        int ans = characterReplacement(str,1);
        System.out.println(ans);
    }
}
