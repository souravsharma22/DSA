
import java.util.Arrays;


public class Q5_RotateArray2 {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        System.out.println(Arrays.toString(nums));
        
    }
    static void reverse(int[] nums,int start, int end)
        {
            int i=start, j= end;
            while(i<j)
            {
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,4,5,6,7};
        int k =11;
        rotate(nums, k);
    }
}
