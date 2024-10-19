

public class LL2_deletion {
    public static Node  deletionatbegin(Node head)
    {
        if(head==null || head.next==null)
            return null;
        else
        {
            head = head.next;
            head.back=null;
            return head;
        }
        
    }
    //deleting at tail
    public static Node  deletionatend(Node head)
    {
        if(head==null || head.next==null)
            return null;
        else
        {
            Node it = head;
            while(it.next!=null)
            {
                it= it.next;
            }
            Node prev = it.back;
            prev.next=null;
            it.back = null;
            return head;
        }
    }
    // deleting at any given position
    public static Node  deletionatposition(Node head,int k)
    {
        if(head==null)
            return null;
        else
        {
            Node it = head;
            int count =0;
            while(it!=null)
            {
                count++;
                if(count ==k)
                    break;
                it= it.next;
            }
            if(k>count)
                return head;
            Node prev = it.back;
            Node front = it.next;
            if(prev==null && front==null)
                return null;
            else if(front == null)
                return deletionatend(head);
            else if(prev == null)
                return deletionatbegin(head);
            else
            {
                prev.next = front;
                front.back=prev;
                it.next= null;
                it.back= null;
                return head;
            }
        }
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
        Node it = head;
        while(it!=null)
        {
            System.out.println(it.data);
            it= it.next;
        }
        head = deletionatbegin(head);
        System.out.println("After removing first element");
        it = head;
        while(it!=null)
        {
            System.out.println(it.data);
            it= it.next;
        }
        
        System.out.println("After deleting the tail");
        head = deletionatend(head);
        it = head;
        while(it!=null)
        {
            System.out.println(it.data);
            it= it.next;
        }
        //deleting at a position
        head = deletionatposition(head, 10);
        System.out.println(("after deleting at give position"));
        it = head;
        while(it!=null)
        {
            System.out.println(it.data);
            it= it.next;
        }

    }
}
