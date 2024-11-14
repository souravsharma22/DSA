import java.util.HashMap;
import java.util.Map;


//// broken code not work in every situation does not check string correctly.
/// 
/// 
/// this is not efficient;
public class Q9_substring {

    public static int substring(String s)
    {
        int low=1,high=s.length();
        if(high==1)
            return 1;
        int ans=0;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(isavailable(s,mid))
            {
                ans=mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }
        return ans;
    }
    private static boolean isavailable(String str,int k)
    {
        Map<Character,Integer> hm = new HashMap<>();
        int i=0;
        while(i<str.length() && hm.size()!=k)
        {
            if(hm.containsKey(str.charAt(i)))
            {
                hm.clear();
                hm.put(str.charAt(i), 1);
            }
            else
                hm.put(str.charAt(i), 1);
            i++;
        }
        if(hm.size()!=k)
            return false;
        return true;
    }
    public static void main(String[] args) {
        String str = "aab";
        int ans = substring(str);
        System.out.println(ans);
    }
}