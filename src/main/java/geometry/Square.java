package geometry;

public class Square extends Rectangular {
    private final double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getSquare() {
        return Math.pow(sideA, 2);
    }

}
