
public class A7_LLInsertion {

    public static Node InsertionAtBegining(Node Head,int data)
    {
        Node temp = new Node(data);
        temp.SetNext(Head);
        Head=temp;
        return Head;
    }
    //Inserting at last
    public static Node InsertAtLast(Node Head,int data)
    {
        Node nn = new Node(data);
        Node temp1 = Head;
        while (temp1.getNext() != null) {
            temp1 = temp1.getNext();
        }
        temp1.SetNext(nn);
        nn.SetNext(null);
        return Head;
    }
    //Inserting at a given position
    public static Node InsertAtPosition(Node Head,int data,int position)
    {
        if(Head==null)
            return null;
        Node nn = new Node(data);
        if (position==1)
        {
            nn.SetNext(Head);
            Head=nn;
            return Head;
        }
        
        Node temp1 = Head;
        int count=0;
        while (temp1!= null) {
            count++;
            if(count==position-1)
            {
                nn.SetNext(temp1.getNext());
                temp1.SetNext(nn);
                
            }       
            temp1 = temp1.getNext();
        }
        return Head;
    }
    public static Node InsertBeforeValue(Node Head,int data,int value)
    {
        if(Head==null)
            return null;
        Node nn = new Node(data);
        if (Head.getData()==value)
        {
            nn.SetNext(Head);
            Head=nn;
            return Head;
        }
        
        Node temp1 = Head;
        while (temp1.getNext()!= null) {
            if(temp1.getNext().getData()==value)
            {
                nn.SetNext(temp1.getNext());
                temp1.SetNext(nn);
                break;
            }       
            temp1 = temp1.getNext();
        }
        return Head;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        Node Head = new Node(arr[0]);
        Node count = Head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            count.SetNext(temp);
            count = temp;
        }
        Head = InsertionAtBegining(Head, 78787);
        Head = InsertAtLast(Head, 99999);
        Head = InsertAtPosition(Head, 5555, 5);
        Head = InsertAtPosition(Head, 101010, 10);
        Head = InsertAtPosition(Head, 2222222, 12);
        Head= InsertBeforeValue(Head, 00000, 5555);
        Node temp1 = Head;
        while (temp1 != null) {
            System.out.println(temp1.getData());
            temp1 = temp1.getNext();
        }
    }
}
