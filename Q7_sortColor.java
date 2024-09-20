
import java.util.Arrays;

public class Q7_sortColor {
    public static void sortColors(int[] nums) {
        int l = 0;
        int r= nums.length-1;
        while(l != r)
        {
            if(nums[l]==0)
                l++;
            if(nums[r]==2)
                r--;
            if(nums[l]==2 && nums[r]!=2)
            {
                swap(nums,l,r);
                r--;
            }
            if(nums[r]==0 && nums[l]!=0)
            {
                swap(nums,l,r);
                l++;
            }
            if(nums[l]==1)
            {
                swap(nums,l,l+1);
                if(nums[l]==1 || nums[l]==0)
                    l++;
            }
            if(nums[r]==1)
            {
                swap(nums,r,r-1);
                if(nums[r]==1 || nums[r]==2)
                    r--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    protected static void swap(int[] nums,int i,int j)
    {
        int temp;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int[] num =new int[]{2,0,2,1,1};
        sortColors(num);
    }
}
