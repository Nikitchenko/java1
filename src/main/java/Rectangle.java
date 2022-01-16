public class Rectangle {
    private int width;
    private int height;

    //constructor with  required properties, which seems suits the task
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

        Rectangle myRect = new Rectangle(40, 50);
        System.out.println("myRect's area is " + myRect.getArea());
    }

    int getArea() {
        return this.width * this.height;
    }

}