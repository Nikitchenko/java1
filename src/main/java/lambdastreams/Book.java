package lambdastreams;

import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Book {
    public static final double MIN_PRICE = 1d;
    public static final double MAX_PRICE = 99d;
    public static final int MIN_NAME_LENGTH = 3;
    public static final int MAX_NAME_LENGTH = 10;
    public static final String LIBRARY_NAME = "Custom Library";
    private String name;
    private BigDecimal price;

    public Book(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {

        System.out.println("Books:");
        List<Book> listOfBooks = generateListOfBooks(10);
        for (Book book : listOfBooks) {
            System.out.println(book);
        }

        System.out.println("\nBook's names:\n" + getBooksNames(listOfBooks));
        System.out.println("\nTotal price of all books:\n" + getTotalPriceOfAllBooks(listOfBooks));
        System.out.println("\nList of books that contains 'A' or 'a' (if any):\n" + getBooksNamesWithAString(listOfBooks, "A"));

        System.out.println("\nName of the books with highest price:");
        for (String book : getBookWithHighestPrice(listOfBooks)) {
            System.out.println(book);
        }

        System.out.println("\nNumber of books where name consists of 5 letters:\n" + getNumberOfBooksSpecificLength(listOfBooks, 5));
        System.out.println("\nBooks with price less than 30.00:\n" + getBooksWithPriceLessThanLimit(listOfBooks, 30.00d));

        System.out.println("\nList of books sorted Desc:");
        for (Book book : getListOfBooksSortedDescByName(listOfBooks)) {
            System.out.println(book);
        }


        System.out.println("\nLibrary name is:\n" + getLibraryName());

    }

    /**
     * Create to identical books
     * One added to a MAP with library
     *
     * @return Library using book that was not added to the MAP
     */
    public static String getLibraryName() {
        Book book1 = new Book("myBook", BigDecimal.valueOf(5).setScale(2, BigDecimal.ROUND_HALF_UP));
        Book book2 = new Book("myBook", BigDecimal.valueOf(5).setScale(2, BigDecimal.ROUND_HALF_UP));
        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, LIBRARY_NAME);
        return mapWithBook.get(book2);
    }

    public static String generateRandomName() {
        int randomBookNameLength = (int) (Math.random() * ((MAX_NAME_LENGTH - MIN_NAME_LENGTH) + 1) + MIN_NAME_LENGTH);
        return RandomStringUtils.randomAlphabetic(randomBookNameLength);

    }

    public static BigDecimal generateRandomPrice() {
        double randomBookPrice = (Math.random() * ((MAX_PRICE - 1 - MIN_PRICE) + 1)) + MIN_PRICE;
        return BigDecimal.valueOf(randomBookPrice).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public static List<Book> generateListOfBooks(int quantityOfBooks) {
        return IntStream.range(0, quantityOfBooks)
                .mapToObj(book -> new Book(generateRandomName(), generateRandomPrice()))
                .collect(Collectors.toList());
    }

    public static List<String> getBooksNames(List<Book> allBooks) {
        return allBooks.stream()
                .filter(Objects::nonNull)
                .map(book -> book.getName().trim())
                .filter(name -> !name.isEmpty())
                .collect(Collectors.toList());
    }

    public static BigDecimal getTotalPriceOfAllBooks(List<Book> allBooks) {
        return allBooks
                .stream()
                .map(Book::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static List<String> getBooksNamesWithAString(List<Book> allBooks, String aString) {

        Predicate<String> isContainAString = bookName -> bookName.toLowerCase().contains(aString.toLowerCase());

        return allBooks.stream()
                .filter(Objects::nonNull)
                .map(book -> book.getName().trim())
                .filter(isContainAString)
                .collect(Collectors.toList());
    }

    /**
     * There can be few books with the same highest price, so we return LIST of their names
     *
     * @param allBooks
     * @return
     */
    public static List<String> getBookWithHighestPrice(List<Book> allBooks) {

        List<BigDecimal> listOfPrices = allBooks.stream()
                .filter(Objects::nonNull)
                .map(Book::getPrice)
                .collect(Collectors.toList());

        Predicate<Book> isMaxPrice = bookName -> bookName.getPrice().compareTo(Collections.max(listOfPrices)) == 0;

        List<Book> listOfBooksWithHighestPrice = allBooks.stream()
                .filter(Objects::nonNull)
                .filter(isMaxPrice)
                .collect(Collectors.toList());

        return getBooksNames(listOfBooksWithHighestPrice);
    }

    public static int getNumberOfBooksSpecificLength(List<Book> allBooks, int nameLength) {

        Predicate<Book> isSpecificLength = bookName -> bookName.getName().length() == nameLength;

        return allBooks.stream()
                .filter(Objects::nonNull)
                .filter(isSpecificLength)
                .map(Book::getName)
                .collect(Collectors.toList())
                .size();
    }

    public static List<Book> getBooksWithPriceLessThanLimit(List<Book> allBooks, double limit) {

        Predicate<Book> isLessThanLimit = book -> book.getPrice().compareTo(BigDecimal.valueOf(limit)) < 1;

        return allBooks.stream()
                .filter(Objects::nonNull)
                .filter(isLessThanLimit)
                .collect(Collectors.toList());
    }

    public static List<Book> getListOfBooksSortedDescByName(List<Book> allBooks) {

        return allBooks.stream()
                .sorted(Comparator.comparing(Book::getPrice))
                .sorted(Comparator.comparing(Book::getName).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && price.equals(book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', price=" + price + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
