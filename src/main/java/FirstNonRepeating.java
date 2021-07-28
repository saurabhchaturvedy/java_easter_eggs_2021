import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {


    private static int firstNonRepeating(String str) {

        Map<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];
            if (map.get(c) == 1) {
                return i;
            }
        }

        return -1;

    }


    public static void main(String[] args) {

        String str = "aabb";

        System.out.println(firstNonRepeating(str));
    }
}
