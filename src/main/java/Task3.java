import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value: ");
        double d1 = Double.parseDouble(s1);
        String s2 = getInput("Enter a numeric value: ");
        double d2 = Double.parseDouble(s2);
        String op = getInput("Choose an operation (+ - * / %): ");

        int result = 0;

        switch (op) {
            case "+":
                result = (int) addValues(d1, d2);
                break;
            case "-":
                result = (int) subtractValues(d1, d2);
                break;
            case "*":
                result = (int) multiplyValues(d1, d2);
                break;
            case "/":
                result = (int) divideValues(d1, d2);
                break;
            case "%":
                result = (int) remindValues(d1, d2);
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

    public static double addValues(double d1, double d2) {
        return d1 + d2;
    }

    public static double subtractValues(double d1, double d2) {
        return d1 - d2;
    }

    public static double multiplyValues(double d1, double d2) {
        return d1 * d2;
    }

    public static double divideValues(double d1, double d2) {
        return d1 / d2;
    }

    public static double remindValues(double d1, double d2) {
        return d1 % d2;
    }
}
