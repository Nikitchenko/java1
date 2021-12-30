package collections;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyCounter {

    public static void main(String[] args) {

        String text = "abraCadabra";
        System.out.println("Text:\n" + text);
        System.out.println("\nFrequency of characters:\n" + countCharFrequency(text));
    }

    public static Map countCharFrequency(String text) {

        Map<String, Integer> frequencyDictionary = new TreeMap<String, Integer>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String s = String.valueOf(c);

            if (!frequencyDictionary.containsKey(s)) {
                frequencyDictionary.put(s, 1);
            } else {
                int n = frequencyDictionary.get(s) + 1;
                frequencyDictionary.put(s, n);
            }
        }
        return frequencyDictionary;
    }

}
