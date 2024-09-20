import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p3_mergesortdecending {
    public static void mergeSort(int []arr,int low,int high)
    {
        if(low>=high)
            return;
        int mid = (low +high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void merge(int []arr,int low,int mid,int high)
    {
        int left=low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high)
        {
            if(arr[left]>=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }
        for (int i=low;i<=high;i++)
            arr[i]=temp.get(i-low);
        
    }
    public static void main(String[] args) {
        int []nums = new int[]{5,6,3,4,22,5,2,1,9};
        mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
