public class LL3_insertion {
    


    public static Node  insertionatbegin(Node head,int data)
    {
            Node temp = new Node(data,head,null);
            head.back = temp;
            head = head.back;
            return head;
        
    }
    //deleting at tail
    public static Node  insertionatend(Node head,int data)
    {
    
            Node it = head;
            while(it.next!=null)
            {
                it= it.next;
            }
            Node temp = new Node(data,null,it);
            it.next = temp;
            return head;
        
    }
    // deleting at any given position
    public static Node  insertionatposition(Node head,int k,int data)
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
            if(prev==null)
                return insertionatbegin(head, data);
            else if(it==null)
                return insertionatend(head,data);
            else
            {
                Node nn = new Node(data,it,prev);
                prev.next=nn;
                it.back= nn;
                return head;
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
        System.out.println("adding a element at start");
        head = insertionatbegin(head, 99);
        it = head;
        while(it!=null)
        {
            System.out.println(it.data);
            it= it.next;
        }
        System.out.println("Adding at last");
        head = insertionatend(head, 101010);
        it = head;
        while(it!=null)
        {
            System.out.println(it.data);
            it= it.next;
        }
        head = insertionatposition(head, 7, 7777);
        it = head;
        while(it!=null)
        {
            System.out.println(it.data);
            it= it.next;
        }
    }
}
