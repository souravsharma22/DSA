import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class A8_Dobll {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(0, 100);
        Iterator<Integer> it = ll.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
