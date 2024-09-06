
public class Q3_ProductSubarray {

    public static int product(int[] nums) {
        int max = nums[0];

        int min = nums[0];
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if ( nums.length == 0) {
                return 0;
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= 0) {
                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(nums[i], min * nums[i]);
            } else {
                int temp = max;
                max = Math.max(nums[i], min * nums[i]);
                min = Math.min(nums[i], temp * nums[i]);
            }
            result = Math.max(max, result);
        }
        return result;

    }
    public static void main(String[] args) {
        int []nums = new int[]{-2,0,-1};
        int result = product(nums);
        System.out.println("The maximum product is"+ result);
    }
}
