import geometry.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShape {

    @Test
    public void testRectangleArea() {
        Rectangular testRectangle1 = new Rectangle(2, 3);
        assertEquals(6, testRectangle1.getSquare(), "incorrect area of rectangle");
    }

    @Test
    public void testSquareArea() {
        Rectangular testSquare2 = new Square(2);
        assertEquals(4, testSquare2.getSquare(), "incorrect area of square");
    }

    @Test
    public void testCircleArea() {
        Round testCircle3 = new Circle(3);
        assertEquals(28.27431, testCircle3.getSquare(), "incorrect area of circle");
    }

    @Test
    public void testOvalArea() {
        Round testOval4 = new Oval(2, 1);
        assertEquals(6.28318, testOval4.getSquare(), "incorrect area of oval");
    }

}
