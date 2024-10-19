class Node
{
    int data;
    Node back;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next=null;
        this.back=null;
    }
    Node(int data,Node next1,Node back1)
    {
        this.data = data;
        this.next=next1;
        this.back=back1;
    }
}
public class LL1_create {
   
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,4,5,7,8};
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
            

        }
        Node it = head;
        while(it!=null)
        {
            System.out.println(it.data);
            it= it.next;
        }
        System.out.println(head.next.data);
        System.out.println(head.next.next.back.data);
    }
}