import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberHolder {

    @Test
    public void testInitialValues() {
        NumberHolder myTestNumberHolder = new NumberHolder();
        assertEquals(0, myTestNumberHolder.getAnInt());
        assertEquals(0.00, myTestNumberHolder.getAFloat());
    }

    @Test
    public void testUpdatedValues() {
        NumberHolder myTestNumberHolder = new NumberHolder();
        myTestNumberHolder.setAnInt(20);
        myTestNumberHolder.setAFloat(3.11f);
        assertEquals(20, myTestNumberHolder.getAnInt());
        assertEquals(3.11f, myTestNumberHolder.getAFloat());
    }

}
