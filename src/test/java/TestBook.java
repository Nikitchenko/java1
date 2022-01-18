import lambdastreams.Book;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;

import static lambdastreams.Book.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBook {

    List<Book> testBooksList = new ArrayList(Arrays.asList(
            new Book("Fight club", BigDecimal.valueOf(21.00).setScale(2, BigDecimal.ROUND_HALF_UP)),
            new Book("Terminator", BigDecimal.valueOf(10.11).setScale(2, BigDecimal.ROUND_HALF_UP)),
            new Book("Terminator", BigDecimal.valueOf(98.78).setScale(2, BigDecimal.ROUND_HALF_UP)),
            new Book("Eclipse part A", BigDecimal.valueOf(98.78).setScale(2, BigDecimal.ROUND_HALF_UP)),
            new Book("Forrest Gump", BigDecimal.valueOf(32.00).setScale(2, BigDecimal.ROUND_HALF_UP))
    ));

    @Test
    public void testGenerateRandomName() {

        assertTrue(MIN_NAME_LENGTH <= Book.generateRandomName().length() &&
                Book.generateRandomName().length() <= MAX_NAME_LENGTH, "Random name has incorrect name length.");
    }

    @Test
    public void testGenerateRandomPrice() {

        assertTrue(MIN_PRICE <= Book.generateRandomPrice().doubleValue() &&
                Book.generateRandomPrice().doubleValue() < MAX_PRICE, "Random price is more or less than required.");
    }

    @Test
    public void testGenerateListOfBooks() {
        int testListSize = 10;
        List<Book> testListOfBooksGenerated = Book.generateListOfBooks(testListSize);

        assertEquals(testListSize, testListOfBooksGenerated.size(), "Generated list has incorrect size.");
        assertTrue(testListOfBooksGenerated.get(0) instanceof Book, "Generated list first item is not Book.");
    }

    @Test
    public void testListOfBooksToString() {

        String testString = "[Book{name='Fight club', price=21.00}, " +
                "Book{name='Terminator', price=10.11}, " +
                "Book{name='Terminator', price=98.78}, " +
                "Book{name='Eclipse part A', price=98.78}, " +
                "Book{name='Forrest Gump', price=32.00}]";

        assertEquals(testString, testBooksList.toString(), "To String method works incorrectly.");
    }

    @Test
    public void testGetBooksNames() {

        List<String> testListOfBooksNames = new ArrayList<>(Arrays.asList("Fight club", "Terminator", "Terminator", "Eclipse part A", "Forrest Gump"));

        assertEquals(testListOfBooksNames, Book.getBooksNames(testBooksList), "Incorrect list of books names.");
    }

    @Test
    public void testGetTotalPriceOfAllBooks() {

        BigDecimal testTotalPrice = BigDecimal.valueOf(260.67).setScale(2, BigDecimal.ROUND_HALF_UP);

        assertEquals(testTotalPrice, Book.getTotalPriceOfAllBooks(testBooksList), "Incorrect total price of all books.");
    }

    @Test
    public void testGetBooksNamesWithAString() {

        List testBooksListWithA = new ArrayList(Arrays.asList("Terminator", "Terminator", "Eclipse part A"));

        assertEquals(testBooksListWithA, Book.getBooksNamesWithAString(testBooksList, "A"), "Incorrect list of books with 'A'.");
    }

    @Test
    public void testGetBookNameWithHighestPrice() {

        List testBooksListWithHighestPrice = new ArrayList(Arrays.asList("Terminator", "Eclipse part A"));

        assertEquals(testBooksListWithHighestPrice, Book.getBookWithHighestPrice(testBooksList), "Incorrect names of books with highest price.");
    }

    @Test
    public void testGetNumberOfBooksSpecificLength() {

        int testNameLength = 10;
        int numberOfBooksWithSpecificNameLength = 3;
        // we use testBooksList for testing, there 3 books with name length 10 letters

        assertEquals(numberOfBooksWithSpecificNameLength, Book.getNumberOfBooksSpecificLength(testBooksList, testNameLength),
                "Incorrect number of books with name length 10 characters.");
    }

    @Test
    public void testGetBooksWithPriceLessThanLimit() {

        List<Book> testBooksListWithPriceLessThanLimit = new ArrayList(Arrays.asList(
                new Book("Fight club", BigDecimal.valueOf(21.00).setScale(2, BigDecimal.ROUND_HALF_UP)),
                new Book("Terminator", BigDecimal.valueOf(10.11).setScale(2, BigDecimal.ROUND_HALF_UP))
        ));

        assertEquals(testBooksListWithPriceLessThanLimit, Book.getBooksWithPriceLessThanLimit(testBooksList, 30.00),
                "Incorrect list of books with price less than limit.");
    }

    @Test
    public void testGetListOfBooksSortedDescByName() {

        List<Book> testBooksListSorted = new ArrayList(Arrays.asList(
                new Book("Terminator", BigDecimal.valueOf(10.11).setScale(2, BigDecimal.ROUND_HALF_UP)),
                new Book("Terminator", BigDecimal.valueOf(98.78).setScale(2, BigDecimal.ROUND_HALF_UP)),
                new Book("Forrest Gump", BigDecimal.valueOf(32.00).setScale(2, BigDecimal.ROUND_HALF_UP)),
                new Book("Fight club", BigDecimal.valueOf(21.00).setScale(2, BigDecimal.ROUND_HALF_UP)),
                new Book("Eclipse part A", BigDecimal.valueOf(98.78).setScale(2, BigDecimal.ROUND_HALF_UP))
        ));

        assertEquals(testBooksListSorted, Book.getListOfBooksSortedDescByName(testBooksList),"List sorted incorrectly.");
    }

    @Test
    public void testGetLibraryName() {

        assertEquals(LIBRARY_NAME, getLibraryName(), "Incorrect library name.");
    }

}
