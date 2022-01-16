public class Task2dot5 {

    public static void main(String[] args) {

        String question1 = "Question2.5:\n" +
                "The following code creates one array and one string object." +
                " How many references to those objects exist after the code executes? " +
                "Is either object eligible for garbage collection?\n" +
                "...\n" +
                "String[] students = new String[10];\n" +
                "String studentName = \"Peter Parker\";\n" +
                "students[0] = studentName;\n" +
                "studentName = null;\n" +
                "...\n";

        String answer1 = "Answer 2.5:\n" +
                "After code execution there is one reference to the array \"students\" " +
                "which contain one reference to the string \"studentName\".\n" +
                "The object \"students\" is not eligible for garbage collection because it has a reference." +
                " The object \"studentName\" is not eligible for garbage collection too because \"students\" has a reference to it.";

        System.out.println(question1);
        System.out.println(answer1);

    }
}
