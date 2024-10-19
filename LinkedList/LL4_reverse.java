
import java.util.Stack;

public class LL4_reverse {
    // reversing the kinked list using stack
    public static Node reveseusingStack(Node head)
    {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp !=null)
        {
            st.push(temp.data);
            temp= temp.next;
        }
        temp =head;
        while(temp!=null)
        {
            temp.data=st.pop();
            temp = temp.next;
        }
        return head;
    }
    // reversing the linked list by reversing links
    public static Node reverselist(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node temp =head;
        Node prev = null;
        while(temp!=null)
        {
            prev = temp.back;
            temp.back=temp.next;
            temp.next=prev;
            temp= temp.back;
        }
        return prev.back;
    }
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,4,5,7,8,9,10,11,12,13};
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
       
        System.out.println("after reversing the list");
        Node newhead = reverselist(head);
        Node it = newhead;
        if(it==null)
            System.out.println("Khali hai b..");
        while(it!=null)
        {
            System.out.println(it.data);
            it=it.next;
        }
    }
}
