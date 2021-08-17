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

        Map<String, Integer> sortedFrequencyMap = new TreeMap<String, Integer>((k1, k2) -> {

            Integer v1 = frequencyMap.get(k1);
            Integer v2 = frequencyMap.get(k2);

            if (!v1.equals(v2)) {
                return v2 - v1;
            }

            return k1.compareTo(k2);
        });


        sortedFrequencyMap.putAll(frequencyMap);

        return sortedFrequencyMap;

    }


    public static void main(String[] args) {

        String str = "Best items in category are Samsung lenovo. Samsung items are nice. Lenovo are cool";

        System.out.println(getFrequencyView(str));
    }
}
