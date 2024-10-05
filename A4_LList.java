
class Node {

    int data;
    Node next;

    Node(int data, Node next1) {
        this.data = data;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class A4_LList {

    public static Node cnverter(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Node head = cnverter(arr);
        System.out.println(head.data);
        Node m = head;
        int count =0;
        while(m!=null)
        {
            System.out.println(m.data);
            m=m.next;
            count++;
        }
        System.out.println("Length of linked list is "+count);
    }
}
