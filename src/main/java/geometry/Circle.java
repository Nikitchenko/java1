package geometry;

public class Circle extends Round {

    public Circle(double axisA) {
        // add default axisB = 0, because we really do not need axisB for Circle
        super(axisA, 0);
    }

    @Override
    public double getSquare() {
        return PI * Math.pow(getAxisA(), 2);
    }
}
