package model;

public class Book {

    private String id;
    private String title;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public static Book findById(String id) {
        return new Book(id, "From Russia with love");
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
