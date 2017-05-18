package org.launchcode.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by jeannie on 5/11/17.
 */
public class Book {


    @NotNull
    @Size(min = 1, max = 10)
    private String isbn;

    @NotNull
    @Size(min = 1, max = 100)
    private String bookTitle;

    @NotNull
    @Size(min = 1, max = 50)
    private String author;

    private int bookId;
    private static int nextId = 1;


    public Book() {
        bookId = nextId;
        nextId++;
    }


    public Book(String isbn, String bookTitle, String author) {
        this();
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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



}
