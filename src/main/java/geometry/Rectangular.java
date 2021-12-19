package geometry;

public abstract class Rectangular implements Shape {
    private double sideA;
    private double sideB;

    public Rectangular(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangular(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSquare() {
        return this.sideA * this.sideB;
    }

}
