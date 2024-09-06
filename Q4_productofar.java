

public class Q4_productofar {
    public static  int[] productExceptSelf(int[] nums) {
        int answer[] = new int[nums.length];
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        for (int i=0; i<nums.length-1;i++)
        {
            left[i+1]=left[i]*nums[i];
        }
        for (int i = nums.length-1;i>0;i--){
            right[i-1]=right[i]*nums[i];
        }
        for (int i=0;i<nums.length;i++)
        {
            answer[i]=left[i]*right[i];
        }
        return answer;
    }
    public static void main(String[] args) {

        int nums[] = new int[]{-1,1,0,-3,3};
        int[] answer = productExceptSelf(nums);
        for (int i : answer) {
            System.out.println(i);
        }
    }   
}
