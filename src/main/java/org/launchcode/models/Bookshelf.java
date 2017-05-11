package org.launchcode.models;

import java.util.*;

/**
 * Created by jeannie on 5/10/17.
 */
public class Bookshelf {

    private String name;
    private Map<String, String> books;
    private List<String> titles;
    private Set<String> authors;

    // do I need a default constructor when not using a DAO?
    public Bookshelf() {

    }


    public Bookshelf(String name) {
        this.name = name;
        this.books = new HashMap<>();           // use TreeMap for natural ordering
        this.titles = new ArrayList<>();        // use List to allow for duplicate title entries
        this.authors = new TreeSet<>();         // use Set to prevent duplicate author entries
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


    public List<String> getTitles() {
        return titles;
    }


    public Set<String> getAuthors() {
        return authors;
    }


    public void addBook(String title, String author) {
        books.put(title, author);
    }


    public void removeBook(String title) {
        books.remove(title);
    }


    // iteratre over Map's keyset and assign keys to List of titles
    public List<String> findTitles() {
        for(String title : books.keySet()) {
            titles.add(title);
        }
        return titles;
    }


    // iterature over Map's values and assign values to Set of authors
    public Set<String> findAuthors() {
        for(String author: books.values()) {
            authors.add(author);
        }
        return authors;
    }

}
