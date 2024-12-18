

public class bt1_implimentation {
    public static  BinTree root ;
    public static void main(String[] args) {
        root = new BinTree(10);
        root.left=new BinTree(20);
        root.right=new BinTree(30);
        root.left.left=new BinTree(40);
        root.left.right=new BinTree(50);
        System.out.println(root.data);
        System.out.println(root.right.data);
    }
    
}
class BinTree
{
    int data ;
    BinTree left;
    BinTree right;

    public BinTree(int data) {
        this.data= data;
        this.left=null;
        this.right= null;
    }
    

}
