public class A6_llDeletion {
    public static Node deletionAtBegining(Node Head)
    {
        Head = Head.getNext();
        return Head;
    }
    public static Node deletionAtEnd(Node Head)
    {
        if(Head==null || Head.getNext()==null)
        {
            return Head;
        }
        Node temp1=Head;
        while (temp1.getNext().getNext()!=null)
        {
            temp1=temp1.getNext();
        }
        temp1.SetNext(null);
        return Head;
    }
    public static Node deletionAtPosition(Node Head,int k)
    {
        if(Head==null)
        {
            return Head;
        }
        if(k==1)
        {
            Head=Head.getNext();
            return Head;
        }
        int cout=0;
        Node temp1=Head;
        while (temp1!=null)
        {
            cout++;
            if(cout==k-1)//it is stopping at given index and skips the next node to itself 
            // and points directly to its next to next.
            {
                temp1.SetNext(temp1.getNext().getNext());
                return Head;
            }
            temp1=temp1.getNext();
        }
        return Head;
    }
    public static Node deletionbyValue(Node Head,int k)
    {
        Node temp1=Head;
        Node Prev=Head;
        while (temp1!=null)
        {
            if(temp1.getData()==k)//it is stopping at given index and skips the next node to itself 
            // and points directly to its next to next.
            {
                Prev.SetNext(Prev.getNext().getNext());
                return Head;
            }
            Prev=temp1;
            temp1=temp1.getNext();
        }
        return Head;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        Node Head= new Node(arr[0]);
        Node count =Head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp= new Node(arr[i]); 
            count.SetNext(temp);
            count = temp;

        }
        Head = deletionAtPosition(Head, 5);
        Head = deletionbyValue(Head, 9);
        Node temp1=Head;
        while (temp1!=null)
        {
            System.out.println(temp1.getData());
            temp1= temp1.getNext();
        }
    }
}
