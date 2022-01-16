public class Computer {

    private String brand;
    private String screenSize;
    private int numberOfCores;
    private String computerType;

    //constructor with 4 properties
    public Computer(String brand, String screenSize, int numberOfCores, String computerType) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.numberOfCores = numberOfCores;
        this.computerType = computerType;
    }

    //constructor with 3 properties - just for consistency
    public Computer(String brand, String screenSize, int numberOfCores) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.numberOfCores = numberOfCores;
    }

    //constructor with 2 properties
    public Computer(String brand, String screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;

    }

    public static void main(String[] args) {
        Computer myComp1 = new Computer("HP", "1200x740", 4, "Laptop");
        Computer myComp2 = new Computer("Acer", "1600x800");
        myComp1.print();
        myComp2.print();

    }

    String getBrand() {
        return this.brand;
    }

    String getScreenSize() {
        return this.screenSize;
    }

    int getNumberOfCores() {
        return this.numberOfCores;
    }

    String getComputerType() {
        return this.computerType;
    }

    @Override
    public String toString() {

        return "Brand: " + brand + "\n" + "Screen size: " + screenSize + "\n" +
                "Number of cores: " + numberOfCores + "\n" + "Type: " + computerType + "\n";

    }

    public void print() {
        System.out.println(this);
    }

}
