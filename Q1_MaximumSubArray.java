public class Q1_MaximumSubArray {
    public static int max(int[] num)
    {
        int ans= num[0];
        int current_sum= num[0];
        for (int i =0;i<num.length;i++){
            if(current_sum<0){
                current_sum=0;
            }
            current_sum= current_sum +num[i];
            if(ans<current_sum)
            {
                ans=current_sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []a = new int[]{2,4,5,-8,-6,6,-2,7,9};
        int ans= max(a);
        System.out.println("the maximum sum of sub array is"+ans);
    }
}
