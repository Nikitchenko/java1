import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestVector {

    Vector testVector1 = new Vector(1, 2, 3);
    Vector testVector2 = new Vector(2, 2, 2);
    Vector testVector3 = new Vector(7, 8, 9);

    @Test
    public void testVector() {

        // check that constructor works well
        assertEquals(8, testVector3.getCoordY(), "Not expected coordY in new vector");
        testVector3.setCoordY(10);
        assertEquals(10, testVector3.getCoordY(), "Not expected coordY in the vector after change");
    }

    @Test
    public void testCalculateVectorLength() {
        assertEquals(3.7416573867739413, testVector1.calculateVectorLength(), "incorrect vector's length");
    }

    @Test
    public void testCalculateDotProduct() {
        assertEquals(12.00d, Vector.calculateDotProduct(testVector1, testVector2), "incorrect dot product");
    }

    @Test
    public void testGenerateVectorRandom() {

        // Our random Vectors have coordinates in range 0<coordinate<100
        // let`s check some of them
        assertTrue(0.00d <= Vector.generateRandomVectors()[0].getCoordX() &&
                Vector.generateRandomVectors()[0].getCoordY() <= 100.00d, "not expected coordY in new random vector");
        assertTrue(0.00d <= Vector.generateRandomVectors()[1].getCoordY() &&
                Vector.generateRandomVectors()[2].getCoordZ() <= 100.00d, "not expected coordZ in new random vector");
    }

    @Test
    public void testCalculateDotProductRandom() {

        // Because our random Vectors have coordinates in range 0<coordinate<100
        // assert that dot product will be in range 0<=value<=300
        assertTrue(0.00d <= Vector.calculateDotProduct() &&
                Vector.calculateDotProduct() <= 300.00d, "not expected dot product of random vectors");
    }

}
