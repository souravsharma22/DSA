
public class QLL1_intersectionNode {

    public static singleNode getIntersectionNode(singleNode headA, singleNode headB) {
        int n = 0, m = 0;
        singleNode ha = headA, hb = headB;
        while (ha != null || hb != null) {
            if (ha != null) {
                n++;
                ha = ha.next;
            }
            if (hb != null) {
                m++;
                hb = hb.next;
            }
        }
        int k = Math.min(n, m);
        ha = headA;
        hb = headB;
        for (int i = 0; i < Math.max(m, n) - k; i++) {
            if (n > m) {
                ha = ha.next;
            }
            if (m > n) {
                hb = hb.next;
            }
        }
        int count = 0;

        while (count != k) {
            count++;
            if (ha == hb) {
                return ha;
            }
            ha = ha.next;
            hb = hb.next;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{15, 50, 31, 90, 32, 1, 2, 0, 1};
        singleNode head = new singleNode(arr[0]);
        singleNode prev = head;
        for (int i = 1; i < arr.length; i++) {
            singleNode temp = new singleNode(arr[i], null);
            prev.next = temp;
            prev = temp;
        }
        int[] arr2 = new int[]{41, 60, 51, 0, 22, 89};
        singleNode head2 = new singleNode(arr2[0]);
        singleNode curr = head2;
        for (int i = 1; i < arr2.length; i++) {
            singleNode temp = new singleNode(arr2[i], null);
            curr.next = temp;
            curr = temp;
        }
        curr.next = head.next.next.next.next.next;

        singleNode h1 = head;
        singleNode h2 = head2;
        while (h1 != null) {
            System.out.println(h1.data);
            h1 = h1.next;
        }
        System.out.println("The next list");
        while (h2 != null) {
            System.out.println(h2.data);
            h2 = h2.next;
        }
        singleNode intersection = getIntersectionNode(head, head2);
        singleNode it = intersection;
        while (it != null) {
            System.out.println(it.data);
            it = it.next;
        }
    }
}
