public class LL5_sort012 {

    public static singleNode sortcolor(singleNode head)
    {
        singleNode zerohead = new singleNode();
        singleNode zero = zerohead;
        singleNode onehead = new singleNode();
        singleNode one = onehead;
        singleNode twohead = new singleNode();
        singleNode two = twohead;
        singleNode temp =head;
        while(temp!=null)
        {
            if(temp.data==0)
            {
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data==1)
            {
                one.next=temp;
                one= temp;
            }
            else
            {
                two.next = temp;
                two = temp;
            }

            temp=temp.next;
        }
        if(onehead.next==null)
            zero.next=twohead.next;
        else
            zero.next = onehead.next;
        one.next=twohead.next;
        two.next=null;
        head = zerohead.next;
        return head;
    }
    public static void main(String[] args) {
        int []arr = new int[]{1,0,1,0,2,1,2,0,1};
        singleNode head = new singleNode(arr[0]);
        singleNode prev = head;
        for(int i=1;i<arr.length;i++)
        {
            singleNode temp = new singleNode(arr[i],null);
            prev.next=temp;
            prev=temp;
        }
        singleNode it = head;
        while(it!=null)
        {
            System.out.println(it.data);
            it= it.next;
        }
        head = sortcolor(head);
        it = head;
        while(it!=null)
        {
            System.out.println(it.data);
            it= it.next;
        }
    }
}
