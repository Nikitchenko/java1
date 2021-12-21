package geometry;

public abstract class Rectangular implements Shape {
    private double sideA;
    private double sideB;

    public Rectangular(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSquare() {
        return sideA * sideB;
    }

}
