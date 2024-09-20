
import java.util.Arrays;

public class A1_bubbleSort {
    public static void bubbleSort(int []arr)
    {
        int n = arr.length;
        for (int i=n-2;i>=1;i--)
        {
            for (int j=0;j<=i;j++)
            {
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }
    public static void swap(int []arr,int i,int j)
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []arr = new int[]{51,25,3,200,45,56,24};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
