package org.launchcode.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by jeannie on 5/13/17.
 */
public class BookData {


    static HashMap<String,Book> books = new HashMap<String,Book>();

    //use List to allow for duplicate title entries
    static ArrayList<String> bookTitles = new ArrayList<String>();

    //use Set to prevent duplicate author entries
    static TreeSet<String> authors = new TreeSet<String>();


    public static void addBook(String isbn, String bookTitle, String author) {
        Book newBook = new Book(isbn, bookTitle, author);
        books.put(newBook.getIsbn(),newBook);
    }


    public static void removeBook(String isbn) {
        books.remove(isbn);
    }

    public static Book getBookById(int id) {
        Book theBook = null;
        //iterate over HashMap entries, pulling id field from each value
        for(Map.Entry<String,Book> book : books.entrySet()) {
            int bookId = book.getValue().getBookId();
            if(bookId == id) {
                theBook = book.getValue();
                break;
            }
        }
        return theBook;
    }

    public static Book getBookByIsbn(String isbn) {
        Book theBook = null;
        //iterate over HashMap's keyset
        for(String isbnKey : books.keySet()) {
            if(isbnKey.equals(isbn)) {
                theBook = books.get(isbn);
                break;
            }
        }
        return theBook;
    }


    public static HashMap<String,Book> getAllBooks() {
        return books;
    }

    //iterate over HashMap entries, pulling bookTitle field from each value
    public static ArrayList<String> getAllBookTitles() {
        for(Map.Entry<String,Book> book : books.entrySet()) {
            bookTitles.add(book.getValue().getBookTitle());
        }
        return bookTitles;
    }

    //iterate over HashMap entries, pulling bookTitle field from each value
    public static TreeSet<String> getAllAuthors() {
        for(Map.Entry<String,Book> book : books.entrySet()) {
            authors.add(book.getValue().getAuthor());
        }
        return authors;
    }

}
