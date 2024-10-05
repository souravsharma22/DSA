
import java.util.Arrays;

public class A3_QuickSort {
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int place(int []arr,int low ,int high)
    {
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j)
        {
            while(arr[i]<=pivot && i<high)
                i++;
            while(arr[j]>pivot && j>low)
                j--;
            if(i<j)
                swap(arr,i,j);
        }
        swap(arr, low, j);
        return j;
    }
    public static void quickSort(int []arr,int low ,int high)
    {
        if(low<high)
        {
            int part=place(arr, low, high);
            quickSort(arr, low, part-1);
            quickSort(arr, part+1,high);
        }
    }
    public static void main(String[] args) {
        int []array = new int[]{7,8,5,3,2,3,4,9,1};
        quickSort(array, 0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
