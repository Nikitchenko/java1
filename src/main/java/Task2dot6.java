public class Task2dot6 {

    public static void main(String[] args) {

        String question2 = "Question2.6:\n" + "How does a program destroy an object that it creates?\n";

        String answer2 = "Answer 2.6:\n" +
                "A program does not destroy objects directly. \n" +
                "But a program can set all references to an object to null (no references)," +
                " if so - objects become eligible for garbage collection.\n" +
                "More details about Garbage Collection can be found in" +
                " https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html";

        System.out.println(question2);
        System.out.println(answer2);

    }
}
