import lambdastreams.Person;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPerson {

    @Test
    public void testFindFirstNames() {
        List<Person> testPersonList = new ArrayList<>();
        testPersonList.add(new Person("Peter", "Patterson", 21));
        testPersonList.add(new Person("Paul", "Walker", 31));
        testPersonList.add(new Person("Steve", "Runner", 17));
        testPersonList.add(new Person("Arnold", "", -1));
        testPersonList.add(new Person(" ", "Stevenson", 19));
        testPersonList.add(new Person("   ", "Stevenson", 19));
        testPersonList.add(new Person("", "Stevenson", 19));
        testPersonList.add(new Person(" Arnold", "Stevenson", 19));
        testPersonList.add(null);
        testPersonList.add(new Person("Aaron", "Bortnicker", 18));

        Set<String> testUniqueFirstNamesOfAdults = new HashSet<>(Arrays.asList("AARON", "ARNOLD", "PAUL", "PETER"));

        assertEquals(testUniqueFirstNamesOfAdults, Person.findFirstNamesOfAdults(testPersonList), "Collections are not equal.");
    }
}
