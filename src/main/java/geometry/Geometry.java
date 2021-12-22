package geometry;

public class Geometry {

    public static void main(String[] args) {
        System.out.println("Let's calculate an Area of the Shapes.");

        Rectangular rectangle1 = new Rectangle(2, 3);
        System.out.println("Rectangle's Area with sides 2 and 3 is: " + rectangle1.getSquare());

        Rectangular square2 = new Square(2);
        System.out.println("Square's Area with size 2 is: " + square2.getSquare());

        Round circle3 = new Circle(3);
        System.out.println("Circle's Area with radius 3 is: " + circle3.getSquare());

        Round oval4 = new Oval(1, 2);
        System.out.println("Oval's Area with axis 1 and 2 is: " + oval4.getSquare());
    }
}
