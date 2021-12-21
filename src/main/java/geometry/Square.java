package geometry;

public class Square extends Rectangular {

    public Square(double sideA) {
        // add default sideB = 0, because we really do not need sideB for Square
        super(sideA, 0);
    }

    @Override
    public double getSquare() {
        return Math.pow(this.getSideA(), 2);
    }

}
