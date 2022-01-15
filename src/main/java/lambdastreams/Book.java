package lambdastreams;

import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Book {
    public static final double MIN_PRICE = 1d; // Min price is 1.00
    public static final double MAX_PRICE = 98d; // Max price is 98.9999999...
    public static final int MIN_NAME_LENGTH = 3;  //Min included value is 3
    public static final int MAX_NAME_LENGTH = 10; //Max included value is 10
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
        System.out.println("\nName of the book with highest price:\n" + getBookWithHighestPrice(listOfBooks));
        System.out.println("\nNumber of books where name consists of 5 letters:\n" + getNumberOfBooksSpecificLength(listOfBooks, 5));
        System.out.println("\nBooks with price less than 30.00:\n" + getBooksWithPriceLessThanLimit(listOfBooks, 30.00d));

        System.out.println("\nList of books sorted Desc:");
        for (Book book : getListOfBooksSortedDescByName(listOfBooks)) {
            System.out.println(book);
        }

    }

    public static String getRandomName() {
        int randomBookNameLength = (int) (Math.random() * ((MAX_NAME_LENGTH - MIN_NAME_LENGTH) + 1) + MIN_NAME_LENGTH);
        return RandomStringUtils.randomAlphabetic(randomBookNameLength);

    }

    public static BigDecimal getRandomPrice() {
        double randomBookPrice = (Math.random() * ((MAX_PRICE - MIN_PRICE) + 1)) + MIN_PRICE;
        return BigDecimal.valueOf(randomBookPrice).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public static List<Book> generateListOfBooks(int quantityOfBooks) {
        return IntStream.range(0, quantityOfBooks)
                .mapToObj(book -> new Book(getRandomName(), getRandomPrice()))
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

    public static String getBookWithHighestPrice(List<Book> allBooks) {

        return allBooks.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(Book::getPrice))
                .get()
                .getName();
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

        Predicate<Book> isLessThanLimit = bookName -> bookName.getPrice().compareTo(BigDecimal.valueOf(limit)) < 1;

        return allBooks.stream()
                .filter(Objects::nonNull)
                .filter(isLessThanLimit)
                .collect(Collectors.toList());
    }

    public static List<Book> getListOfBooksSortedDescByName(List<Book> allBooks) {

        return allBooks.stream()
                .sorted(Comparator.comparing(Book::getName).reversed())
                .sorted(Comparator.comparing(Book::getPrice))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
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
