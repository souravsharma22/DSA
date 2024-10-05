
class Node1 {

    int data;
    Node1 next;

    Node1(int data, Node1 next1) {
        this.data = data;
        this.next = next1;
    }

    Node1(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class A4_LList {

    public static Node1 cnverter(int arr[]) {
        Node1 head = new Node1(arr[0]);
        Node1 mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node1 temp = new Node1(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Node1 head = cnverter(arr);
        System.out.println(head.data);
        Node1 m = head;
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
