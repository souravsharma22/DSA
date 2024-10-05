public class Q8_Summationll {
   
    public static Node Summation(Node l1,Node l2)
    {
        Node h1= l1;
        Node h2= l2;
        String num1="";
        String num2="";
        while(h1!=null)
        {
            num1 = num1+ h1.getData();
            h1=h1.getNext();
        }
        while(h2!=null)
        {
            num2 = num2+ h2.getData();
            h2=h2.getNext();
        }
        num1= num1.trim();
        num2 = num2.trim();
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        sb1 = sb1.reverse();
        sb2 = sb2.reverse();
        int a= Integer.

        return head;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        int arr1[] = new int[]{2,3,4,5,6};
        Node l1= new Node(arr[0]);
        Node count =l1;
        for(int i=1;i<arr.length;i++)
        {
            Node temp= new Node(arr[i]);
            count.SetNext(temp);
            count = temp;

        }   
        Node l2= new Node(arr1[0]);
        Node count2 =l2;
        for(int i=1;i<arr1.length;i++)
        {
            Node temp= new Node(arr1[i]);
            count2.SetNext(temp);
            count2 = temp;
        }   
        Node h1=l1;
        while(h1!=null)
        {
            System.out.println(h1.getData());
            h1=h1.getNext();
        }
        System.out.println("****************");
        Node h2=l2;
        while(h2!=null)
        {
            System.out.println(h2.getData());
            h2=h2.getNext();
        }
    }
}
