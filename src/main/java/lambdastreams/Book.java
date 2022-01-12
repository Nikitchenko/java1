package lambdastreams;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public static final double MIN_PRICE = 1d; // Min price is 1.00
    public static final double MAX_PRICE = 98d; // Max price is 98.9999999...
    public static final int MIN_NAME_LENGTH = 3;  //Min included value is 3
    public static final int MAX_NAME_LENGTH = 10; //Max included value is 10
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        System.out.println("Books:");
        //System.out.println(generateListOfBooks(10));

        for (Book book : generateListOfBooks(10)){
            System.out.println(book);
        }

        
    }

    public static List<Book> generateListOfBooks(int quantityOfBooks) {
        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < quantityOfBooks; i++) {
            double randomBookPrice = (Math.random() * ((MAX_PRICE - MIN_PRICE) + 1)) + MIN_PRICE;
            double randomBookPriceRounded = Math.round(randomBookPrice * 100.0) / 100.0;

            int randomBookNameLength = (int) (Math.random() * ((MAX_NAME_LENGTH - MIN_NAME_LENGTH) + 1) + MIN_NAME_LENGTH);
            String randomBookName = RandomStringUtils.randomAlphabetic(randomBookNameLength);

            Book newRandomBook = new Book(randomBookName, randomBookPriceRounded);
            bookList.add(newRandomBook);
        }

//        return IntStream.range(0, quantityOfBooks)
//               .mapToObj(book -> new Book(randomBookName,randomPriceRounded)) // or x -> new Object(x).. or any other constructor
//               .collect(Collectors.toList());

        return bookList;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
