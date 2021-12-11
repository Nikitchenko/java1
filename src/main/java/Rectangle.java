public class Rectangle {
    private int width;
    private int height;

    // "strange" constructor with no required properties, which seems to be needed for the task
    public Rectangle() {
    }

    // auxiliary constructor with no required properties, which nice to have for short unit tests
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }

    int area() {
        return this.width * this.height;
    }

}