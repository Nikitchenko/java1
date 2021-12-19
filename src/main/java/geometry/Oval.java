package geometry;

public class Oval extends Round {

    public Oval(double axisA, double axisB) {
        super(axisA, axisB);
    }

    @Override
    public double getSquare() {
        return PI * this.getAxisA() * this.getAxisB();
    }
}
