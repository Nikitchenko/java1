public class Task2dot1 {
    public static void main(String[] args) {

        String php = "PHP Exercises and";
        String python = "Python Exercises";
        String strConcated = concatWithoutP(php, python);

        System.out.println(strConcated);

    }

    public static String concatWithoutP(String s1, String s2) {

        String strConcated = s1 + ' ' + s2;
        strConcated = strConcated.replaceAll("[Pp]", "");

        return strConcated;
    }
}
