import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask2dot1 {

    @Test
    public void testConcatWithoutP() {
        String php = "PHP Exercises and";
        String python = "Python Exercises";
        String concated = "H Exercises and ython Exercises";

        assertEquals(concated, Task2dot1.concatWithoutP(php, python));
    }
}
