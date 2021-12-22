package geometry;

public class Circle extends Round {
    private final double axisA;

    public Circle(double axisA) {
        this.axisA = axisA;
    }

    @Override
    public double getSquare() {
        return PI * Math.pow(axisA, 2);
    }
}
