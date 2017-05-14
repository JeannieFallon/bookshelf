package org.launchcode.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by jeannie on 5/13/17.
 */
public class BookData {


    // TODO: implement .equals() for Book (here or in Book class?)
    //use HashMap to eventually pair books with enum categories; temporarily use bookId for value
    static HashMap<Book,Integer> books = new HashMap<Book, Integer>();

    //use List to allow for duplicate title entries
    static ArrayList<String> bookTitles = new ArrayList<String>();

    //use Set to prevent duplicate author entries
    static TreeSet<String> authors = new TreeSet<String>();


    public static void addBook(String bookTitle, String author) {
        Book newBook = new Book(bookTitle, author);
        books.put(newBook, newBook.getBookId());
    }


    public static void removeBook(Book book) {
        books.remove(book);
    }

    public static Book getBookById(int id) {
        Book theBook = null;
        //iterate of HashMap's values and return corresponding key
        for(Map.Entry<Book,Integer> book : books.entrySet()) {
            //will auto-boxing work here to make Integer match up with int? Or do I need to cast it?
            if(book.getValue() == id) {
                theBook = book.getKey();
            }
        }
        return theBook;
    }


    public static HashMap<Book,Integer> getAllBooks() {
        return books;
    }

    //iterate over HashMap's keyset and each key's bookTile field to ArrayList
    public static ArrayList<String> getAllBookTitles() {
        for(Book book : books.keySet()) {
            bookTitles.add(book.getBookTitle());
        }
        return bookTitles;
    }

    //iterate over HashMap's keyset and each key's author field to TreeSet
    public static TreeSet<String> getAllAuthors() {
        for(Book book : books.keySet()) {
            authors.add(book.getBookTitle());
        }
        return authors;
    }

}
