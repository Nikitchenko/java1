public class Task4 {
    public static void main(String[] args) {

        int[] myIntArray = {5,6,7,12,-5,32,43};
        int result = sumArrayValues(myIntArray);

        System.out.println("The answer (integer) is " + result);
    }


    public static int sumArrayValues(int[] myIntArray) {
        int sum = 0;
        for (int numVal : myIntArray){
            sum += numVal;
        }
        return sum;
    }

}
