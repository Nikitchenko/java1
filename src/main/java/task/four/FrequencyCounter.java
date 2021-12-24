package task.four;

import java.util.HashMap;

public class FrequencyCounter {

    public static void main(String[] args) {

        String text = "abraCadabra";
        System.out.println(countCharFrequency(text));
    }

    public static HashMap countCharFrequency(String text) {

        HashMap<String, Integer> frequencyDictionary = new HashMap<String, Integer>();

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
