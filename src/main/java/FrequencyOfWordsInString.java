import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfWordsInString {


    private static Map<String, Integer> getFrequencyView(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        String[] words = str.split(" +");


        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);

        }

        Map<String, Integer> sortedFrequencyMap = new TreeMap<String, Integer>((e1, e2) -> {

            Integer num1 = frequencyMap.get(e1);
            Integer num2 = frequencyMap.get(e2);

            if (!num1.equals(num2)) {
                return num2 - num1;
            }

            return e1.compareTo(e2);
        });


        sortedFrequencyMap.putAll(frequencyMap);

        return sortedFrequencyMap;

    }


    public static void main(String[] args) {

        String str = "Best items in category are Samsung lenovo. Samsung items are nice. Lenovo are cool";

        System.out.println(getFrequencyView(str));
    }
}
