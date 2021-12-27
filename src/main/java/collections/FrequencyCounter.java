package collections;

import java.util.TreeMap;

public class FrequencyCounter {

    public static void main(String[] args) {

        String text = "abraCadabra";
        System.out.println(countCharFrequency(text));
    }

    public static TreeMap countCharFrequency(String text) {

        TreeMap<String, Integer> frequencyDictionary = new TreeMap<String, Integer>();

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
