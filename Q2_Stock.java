public class Q2_Stock {
    public static int max(int[] p) {
        int profit =0;
        int cur;
        int min =p[0];
        /*for (int i=0;i<p.length;i++)
        {
            for (int j=i;j<p.length;j++)
            {
                cur = p[j]-p[i];
                if(cur>profit)
                {
                    profit=cur;
                }
            }
        }*/

        for (int i=0;i<p.length;i++)
        {
            if(p[i]<min)
                min=p[i];
            cur = p[i]-min;
            if(cur>profit)
                profit=cur;
        }
        return profit;
    }
    public static void main(String[] args) {
        int []price = new int[]{7,1,5,3,6,4};
        int profit = max(price);
        System.out.println("Maximum profit is"+profit);
    }
}
