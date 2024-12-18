public class bt1_subarray {
    static int n=3;
    public static void main(String[] args) {
        
    }
    public static void backtrack(int i,int [][]currentSubset)
    {
        if(i==n)
        {
            System.out.println(currentSubset);
        }
        else
        {
            backtrack(i+1, currentSubset);
            currentSubset
        }
    }
}