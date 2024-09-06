
public class p1_Fibonaci {

    static int fibonaci(int n)
    {
        if (n==1 || n==2) {
            return 1;
        }
        else
            return fibonaci(n-1)+fibonaci(n-2);
    }
    static int factorial(int n)
    {
        if (n==1) {
            return 1;
        }
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args) {
        //System.out.println("Enter how long series you want");
        for (int i=1;i<=100;i++){
            int x=fibonaci(i);
        System.out.println(i+"fibonaci terms sum is"+x);
        }
        for (int i=1;i<=100;i++){
            int x=factorial(i);
        System.out.println("factorial of "+i+"is "+x);
        }
    }
}