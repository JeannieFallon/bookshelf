package org.launchcode.models;

/**
 * Created by jeannie on 5/11/17.
 */
public class Book {

    //TODO: add validation
    private String bookTitle;
    private String author;
    private int bookId;
    private static int nextId = 1;
    //TODO: add enum class Genres


    public Book() {
        bookId = nextId;
        nextId++;
    }


    public Book(String bookTitle, String author) {
        this();
        this.bookTitle = bookTitle;
        this.author = author;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    //TODO: Override .equals()


}
