package org.launchcode.models;

/**
 * Created by jeannie on 5/11/17.
 */
public class Book {

    private String bookTitle;
    private String author;

    public Book() {

    }

    public Book(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public String getBookTitle() {

        return bookTitle;
    }

    public void setTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
