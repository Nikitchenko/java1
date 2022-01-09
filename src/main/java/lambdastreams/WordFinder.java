package lambdastreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WordFinder {

    public static void main(String[] args) {

        String aText = "V's background and identity are never revealed." +
                " He is at one point an inmate at \"Larkhill Resettlement Camp\"—one of many concentration camps where black people," +
                " Jews, leftists, beatniks, homosexuals and Ethnic Irish are exterminated by Norsefire," +
                " a fascist dictatorship that rules Britain. While there," +
                " he is part of a group of prisoners who are subjected to horrific medical experimentation," +
                " conducted by Dr. Delia Surridge. Lewis Prothero is the camp's commandant, while Father Anthony Lilliman," +
                " a paedophile vicar, is at the camp to lend \"spiritual support\"." +
                " All prisoners who are part of the experiment die," +
                " with the sole exception of \"the man in room five\" (\"V\" in Roman numerals)." +
                " As a result of the experiments, the man develops Olympic-level physical abilities and an incredibly expanded intellect." +
                " During that time, the man had some level of communication with Valerie Page, a former actress imprisoned for being a lesbian," +
                " kept in \"room four\", who wrote her autobiography on toilet paper and then pushed it through a hole in the wall.";

        System.out.println("A text:\n" + aText + "\n");

        Collection<String> collectionOfWords = Arrays.asList(aText.split("\\W+"));
        System.out.println("Collection of words:\n" + collectionOfWords + "\n");

        System.out.println("Words that starts from character 'O' (case insensitive):\n" + findWordsStartsO(collectionOfWords) + "\n");
        System.out.println("Words that starts from character 'O' (case insensitive) without duplicates:\n"
                + removeDuplicates(findWordsStartsO(collectionOfWords)) + "\n");

    }

    public static Collection<String> findWordsStartsO(Collection<String> aCollection) {
        Predicate<String> isContainO = word -> word.charAt(0) == 'O' || word.charAt(0) == 'o';

        return aCollection.stream()
                .filter(isContainO)
                .collect(Collectors.toList());
    }

    public static Collection<String> removeDuplicates(Collection<String> aCollection) {
        return new TreeSet<>(aCollection);
    }

}
