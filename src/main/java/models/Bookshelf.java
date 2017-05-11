package models;

import java.util.HashMap;

/**
 * Created by jeannie on 5/10/17.
 */
public class Bookshelf {

    private String name;
    private HashMap<String, String> books;

    public Bookshelf() {

    }

    public Bookshelf(String name) {
        this.name = name;
        this.books = new HashMap<String,String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, String> getBooks() {
        return books;
    }

    public void setBooks(HashMap<String, String> books) {
        this.books = books;
    }

    public void addBook(String title, String author) {
        books.put(title, author);
    }

    public void removeBook(String title) {
        books.remove(title);
    }

}
