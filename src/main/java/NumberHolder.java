public class NumberHolder {

    // it is not correct to have public properties, so we create private instead
//    public int anInt;
//    public float aFloat;
    private int anInt;
    private float aFloat;


    // this constructor seems OK, but we will use another one, for more clear implementation of the task
//    public NumberHolder(int anInt, float aFloat) {
//        this.anInt = anInt;
//        this.aFloat = aFloat;
//    }

    public NumberHolder() {
    }

    public static void main(String[] args) {
        NumberHolder myNumberHolder = new NumberHolder();
        System.out.println("Initial values of myNumberHolder properties: " + "\n" +
                "anInt = " + myNumberHolder.getAnInt() + "\n" +
                "aFloat = " + myNumberHolder.getAFloat() + "\n");

        myNumberHolder.setAnInt(10);
        myNumberHolder.setAFloat(2.01f);
        System.out.println("Updated values of myNumberHolder properties: " + "\n" +
                "anInt = " + myNumberHolder.getAnInt() + "\n" +
                "aFloat = " + myNumberHolder.getAFloat() + "\n");

    }

    public float getAFloat() {
        return aFloat;
    }

    public void setAFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

}
