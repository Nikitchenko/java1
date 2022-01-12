package lambdastreams;

import java.util.*;
import java.util.stream.Collectors;

public class Person {
    static final int ADULT_FROM_AGE = 18;
    private int age;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {

        System.out.println("List of persons:");
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 17));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("   ", "Stevenson", 19));
        personList.add(new Person("      ", "Stevenson", 19));
        personList.add(new Person(" Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));

        for (Person person : personList) {
            System.out.println(person);
        }

        System.out.println("\nList of unique first names of adult persons:\n" + findFirstNamesOfAdults(personList));

    }

    public static Set<String> findFirstNamesOfAdults(Collection<Person> persons) {

        Set<String> personsFirstNames;
        personsFirstNames = persons.stream()
                .filter(Objects::nonNull)
                .filter(adult -> adult.age >= ADULT_FROM_AGE)
                .map(person -> person.firstName.toUpperCase().trim())
                .filter(name -> !name.isEmpty())
                .collect(Collectors.toSet());

        return personsFirstNames;
    }

    @Override
    public String toString() {
        return "Person{"
                + "firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", age=" + age + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String newAge) {
        firstName = newAge;
    }

}
