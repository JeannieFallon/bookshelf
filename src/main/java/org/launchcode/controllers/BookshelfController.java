package org.launchcode.controllers;

import org.launchcode.models.Book;
import org.launchcode.models.BookData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by jeannie on 5/10/17.
 */
@Controller
@RequestMapping(value = "bookshelf")
public class BookshelfController {



    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title","Books");
        model.addAttribute("books", BookData.getAllBooks());
        return "bookshelf/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("title","Add a Book");
        model.addAttribute(new Book());
        return "bookshelf/add";
    }

    //TODO: add validation
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute Book newBook, Model model) {
        BookData.addBook(newBook.getIsbn(), newBook.getBookTitle(), newBook.getAuthor());
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String remove(Model model) {
        model.addAttribute("title","Remove a Book");
        model.addAttribute("books", BookData.getAllBooks());
        return "bookshelf/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String remove(@RequestParam int[] bookIds) {
        for(int bookId : bookIds) {
            // find book using BookData method
            Book bookToRemove = BookData.getBookById(bookId);
            // remove book from BookData's books hashmap
            BookData.removeBook(bookToRemove.getIsbn());
        }
        return "redirect:/bookshelf";
    }

    @RequestMapping(value = "authors", method = RequestMethod.GET)
    public String authors(Model model) {
        TreeSet<String> authors = BookData.getAllAuthors();
        model.addAttribute("title","Authors");
        model.addAttribute("authors",authors);
        return "bookshelf/authors";
    }

    @RequestMapping(value = "titles", method = RequestMethod.GET)
    public String titles(Model model) {
        ArrayList<String> bookTitles = BookData.getAllBookTitles();
        model.addAttribute("bookTitles", bookTitles);
        model.addAttribute("title","Titles");
        return "bookshelf/titles";
    }

    @RequestMapping(value = "about", method = RequestMethod.GET)
    public String about(Model model) {
        model.addAttribute("title","About");
        return "bookshelf/about";
    }

}
