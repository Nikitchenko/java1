package geometry;

public abstract class Round implements Shape {

    // special manipulation to have correct PI 3.14159
    public static final double PI = Math.round(Math.PI * Math.pow(10, 5)) / Math.pow(10, 5);

    private double radius;
    private double axisA;
    private double axisB;

    public Round(double radius) {
        this.radius = radius;
    }

    public Round(double axisA, double axisB) {
        this.axisA = axisA;
        this.axisB = axisB;
    }

    public double getAxisA() {
        return axisA;
    }

    public double getAxisB() {
        return axisB;
    }

    public double getSquare() {
        return PI * Math.pow(this.radius, 2);
    }

}
