public class A5_llInsertion {
    public static Node InsertAtFront(Node head ,int data)
    {
        Node nn = new Node(data);
        nn.SetNext(null);
        if(head==null)
            head=nn;
        else
        {
            nn.SetNext(head);
            head=nn;
        }
        return head;
    }
    public static Node deleteAtFirst(Node head)
    {
        if(head!=null)
        {
            head = head.getNext();
        }
        return head;
    }
    public static void main(String[] args) {
        Node Head = null;
        Head =InsertAtFront(Head,10);
        Head =InsertAtFront(Head,20);
        Head =InsertAtFront(Head,30);
        Head =InsertAtFront(Head,40);
        Head =InsertAtFront(Head,50);
        Head=InsertAtFront(Head, 7777);
        Node temp = Head;
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
        Head = deleteAtFirst(Head);
        Node curr= Head;
        while (curr!= null)
        {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }


    }
}
