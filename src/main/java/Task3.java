import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Task3 {
    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * / %): ");

        int result = 0;

        switch (op) {
            case "+":
                result = (int) addValues(s1, s2);
                break;
            case "-":
                result = (int) subtractValues(s1, s2);
                break;
            case "*":
                result = (int) multiplyValues(s1, s2);
                break;
            case "/":
                result = (int) divideValues(s1, s2);
                break;
            case "%":
                result = (int) remindValues(s1, s2);
                break;
            default:
                System.out.println("Unrecognized operation!");
                return;
        }

        System.out.println("The answer (integer) is " + result);
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    public static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    public static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    public static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }
    public static double remindValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 % d2;
    }
}
