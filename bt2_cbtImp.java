

public class bt2_cbtImp {
    public static void main(String[] args) {
        int[] nn = new int[]{10,20,30,40,50,60,70,80};
        impliment tree1 = new impliment(nn);
        tree1.preordertraversal();
    }
}
class impliment{
    private int[] tree;
    public impliment(int n[])
    {
        this.tree = n;
    }
    private int left(int i)
    {
        return 2*i+1;
    }
    private  int right(int i)
    {
        return i*i+2;
    }
    @SuppressWarnings("unused")
    private int parent(int i)
    {
        return (i-1)/2;
    }

    public void setTree(int[] tree) {
        this.tree = tree;
    }
    private void preordertraversal(int n)
    {
        if(n<this.tree.length)
        {
            System.out.println(this.tree[n]);
            preordertraversal(left(n));
            preordertraversal(right(n));
        }
    }
    public void preordertraversal()
    {
        preordertraversal(0);
    }
    
}
