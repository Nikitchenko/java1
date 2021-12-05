
public class Task2 {

    public static void main(String[] args) {

        System.out.println(getA());
        System.out.println(getB());
        System.out.println(getC());
        System.out.println(getD());
    }

    public static int getA() {
        int a = -5 + 8 * 6;
        return a;
    }

    public static int getB() {
        int b = (55+9) % 9;
        return b;
    }

    public static int getC() {
        int c = 20 + -3*5 / 8;
        return c;
    }

    public static int getD() {
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        return d;
    }

}
