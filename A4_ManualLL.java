class Node{
    private int data;
    private Node next;
    public Node(int data)
    {
        this.data=data;
    }
    public void SetData(int val)
    {
        this.data=val;
    }
    public int getData()
    {
        return this.data;
    }
    public Node getNext()
    {
        return this.next;
    }
    public void SetNext(Node next)
    {
        this.next= next;
    }
}
public class A4_ManualLL {
    public static void main(String[] args) {
        Node ten=new Node(10);
        Node twe=new Node(20);
        Node thir=new Node(30);
        Node four=new Node(40);
        Node fif=new Node(50);

        Node Head = ten;

        System.out.println(Head.getData());
        ten.SetNext(twe);
        twe.SetNext(thir);
        thir.SetNext(four);
        four.SetNext(fif);

        Node temp = Head;
        while(temp.getNext().getNext()!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
        
    }
}
