package geometry;

public class Square extends Rectangular {

    public Square(double sideA) {
        super(sideA);
    }

    @Override
    public double getSquare() {
        return Math.pow(this.getSideA(), 2);
    }

}
