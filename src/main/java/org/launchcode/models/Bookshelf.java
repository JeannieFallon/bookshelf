package org.launchcode.models;

import java.util.*;

/**
 * Created by jeannie on 5/10/17.
 */
public class Bookshelf {

    private String name;
    private Map<String, String> books;
    private List<String> bookTitles;
    private Set<String> authors;

    // do I need a default constructor when not using a DAO?
    public Bookshelf() {
        this.books = new HashMap<>();           // use HashMap for bookTitle:author pairs
        this.bookTitles = new ArrayList<>();    // use List to allow for duplicate bookTitle entries
        this.authors = new TreeSet<>();         // use Set to prevent duplicate author entries
    }


    public Bookshelf(String name) {
        this();
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Map<String, String> getBooks() {
        return books;
    }


    public List<String> getbookTitles() {
        return bookTitles;
    }


    public Set<String> getAuthors() {
        return authors;
    }


    public void addBook(String bookTitle, String author) {
        books.put(bookTitle, author);
    }


    public void removeBook(String bookTitle) {
        books.remove(bookTitle);
    }


    // iteratre over Map's keyset and assign keys to List of bookTitles
    public List<String> findbookTitles() {
        for(String bookTitle : books.keySet()) {
            bookTitles.add(bookTitle);
        }
        return bookTitles;
    }


    // iterature over Map's values and assign values to Set of authors
    public Set<String> findAuthors() {
        for(String author: books.values()) {
            authors.add(author);
        }
        return authors;
    }

}
