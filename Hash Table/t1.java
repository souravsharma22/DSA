
import java.util.HashMap;
import java.util.Map;

public class t1 {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("JAnuary", 1);
        mp.put("Feb", 2);
        mp.put("mar", 3);
        mp.put("apl", 4);
        System.out.println(mp.get("JAnuary"));
        System.out.println(mp.containsKey("apl"));
    }
}
