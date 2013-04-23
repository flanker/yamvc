package model;

import java.util.Arrays;
import java.util.List;

public class Book {

    public static final List<Book> BOOKS = Arrays.asList(
            new Book("1", "Dr. No"),
            new Book("2", "From Russia with love"),
            new Book("3", "Diamonds Are Forever"),
            new Book("4", "For Your Eyes Only"),
            new Book("5", "Thunderball"),
            new Book("6", "Live and Let Die"),
            new Book("7", "On Her Majesty's Secret Service"),
            new Book("8", "You Only Live Twice"),
            new Book("9", "The Man with the Golden Gun")
    );
    private String id;
    private String title;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public static Book findById(String id) {
        for (Book book : BOOKS) {
            if (book.id.equals(id)) {
                return book;
            }
        }
        return BOOKS.get(0);
    }

    public static List<Book> findAll() {
        return BOOKS;
    }
}
