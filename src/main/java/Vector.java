import java.util.Random;

public class Vector {
    private double coordX;
    private double coordY;
    private double coordZ;

    public Vector(double x, double y, double z) {
        this.coordX = x;
        this.coordY = y;
        this.coordZ = z;
    }

    public static void main(String[] args) {
        Vector myVector1 = new Vector(1, 2, 3);
        Vector myVector2 = new Vector(2, 2, 2);
        System.out.println("My 1st Vector: " + myVector1);
        System.out.println("My 2nd Vector: " + myVector2);
        System.out.println("Length of my 1st Vector: " + myVector1.calculateVectorLength());
        System.out.println("Length of my 2nd Vector: " + myVector2.calculateVectorLength());
        System.out.println("Dot product (scalar multiplication) of my 1st and 2nd Vectors: " +
                calculateDotProduct(myVector1, myVector2));
        System.out.println("Dot product (scalar multiplication) of random Vectors: " +
                calculateDotProduct());
    }

    /**
     * Such implementation of calculation dot product requires 2 arguments
     *
     * @param vector1
     * @param vector2
     * @return scalar multiplication
     */
    public static double calculateDotProduct(Vector vector1, Vector vector2) {
        return vector1.getCoordX() * vector2.getCoordX() +
                vector1.getCoordY() * vector2.getCoordY() +
                vector1.getCoordZ() * vector2.getCoordZ();
    }

    /**
     * "Overloaded" method for calculation dot product. It uses random Vectors
     *
     * @return scalar multiplication
     */
    public static double calculateDotProduct() {
        return calculateDotProduct(generateRandomVectors()[1], generateRandomVectors()[2]);
    }

    public static Vector[] generateRandomVectors() {
        int vectorsQuantity = 3;
        Vector[] randomVectors = new Vector[vectorsQuantity];
        for (int i = 0; i < vectorsQuantity; i++) {
            double[] anArray = new Random().doubles(3, 0, 10).toArray();
            randomVectors[i] = new Vector(anArray[0], anArray[1], anArray[2]);
        }
        return randomVectors;
    }

    public double calculateVectorLength() {
        return Math.sqrt(Math.pow(coordX, 2) + Math.pow(coordY, 2) + Math.pow(coordZ, 2));
    }

    @Override
    public String toString() {
        return "{" + "coordX=" + coordX + ", coordY=" + coordY + ", coordZ=" + coordZ + '}';
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public double getCoordZ() {
        return coordZ;
    }

    public void setCoordZ(double coordZ) {
        this.coordZ = coordZ;
    }
}
