import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Q1_TwoSum {
    public static int[] twosum(int []nums,int target)
    {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
        
            int sum = target - nums[i];
            if(mp.containsKey(sum))
            {
                return new int[]{mp.get(sum),i};
            }
            else
                mp.put(nums[i],i);
        }
        //System.out.println(Arrays.toString(index));
        return null;    
    }
    public static void main(String[] args) {
        int[] muns = new int[]{1,3,4,7,9,6};
        int []ans = twosum(muns, 8);
        System.out.println(Arrays.toString(ans));
    }
}