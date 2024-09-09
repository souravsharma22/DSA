import java.util.Arrays;

public class Q5_RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int[] arr = new int[n];

        for (int i=n-k,j=0;i<n && j<k;i++,j++)
        {
            arr[j]= nums[i];
        }
        for (int i=k,j=0;i<n && j<n-k;i++,j++)
        {
            arr[i]= nums[j];
        }
        
        System.out.println(Arrays.toString(arr));
        
    }
    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,4,5,6,7};
        int k =11;
        rotate(nums, k);
    }
}
