public class singleNode {

    int data;
    singleNode next;
   
    public singleNode(int data) {
        this.data=data;
        this.next=null;
    }

    public singleNode(int data, singleNode next) {
        this.data = data;
        this.next = next;
    }
    public singleNode()
    {

    }
    public static void main(String[] args) {
        singleNode s1 = new singleNode(5);
        singleNode s2 = new singleNode(15,s1);
        singleNode head = s2;
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }
    
}
