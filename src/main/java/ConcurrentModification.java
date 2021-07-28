import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModification {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("test1",1);
        map.put("test2",2);
        map.put("test3",3);

        for (Map.Entry<String, Integer> next : map.entrySet()) {

            System.out.println(next.getValue());
            map.put("test8", 8);  // try existing a new entry
        }
    }
}
