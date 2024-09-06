
import java.util.Arrays;

public class p2_array {
    public static void main(String[] args) {
        int []arr = new int[]{10,3,6,7,4,13,11};
        System.out.println(Arrays.toString(arr ));
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
