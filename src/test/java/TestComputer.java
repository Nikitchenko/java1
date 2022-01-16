import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComputer {

    @Test
    public void testMyComputer4() {
        Computer myTestComp4 = new Computer("HP", "1200x740", 3, "Desktop");

        //  check that constructor with 4 properties works well; 3rd and 4th properties is enough
        assertEquals(3, myTestComp4.getNumberOfCores());
        assertEquals("Desktop", myTestComp4.getComputerType());

    }

    @Test
    public void testMyComputer2() {
        Computer myTestComp2 = new Computer("Asus", "1600x800");

        //  check that constructor with only 2 properties works well
        assertEquals("Asus", myTestComp2.getBrand());
        assertEquals("1600x800", myTestComp2.getScreenSize());
    }


}
