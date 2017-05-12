package org.launchcode.controllers;

import org.launchcode.models.Book;
import org.launchcode.models.Bookshelf;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jeannie on 5/10/17.
 */
@Controller
@RequestMapping(value = "bookshelf")
public class BookshelfController {


    Bookshelf bookshelf = new Bookshelf();


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Books");
        model.addAttribute("bookshelf", bookshelf);
        return "bookshelf/index";
    }


    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("title","Add a Book");
        model.addAttribute(new Book());
        return "bookshelf/add";
    }


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute Book newBook, Model model) {
        String bookTitle = newBook.getBookTitle();
        String author = newBook.getAuthor();
        bookshelf.addBook(bookTitle, author);
        model.addAttribute("title", "Bookshelf");
        model.addAttribute("bookshelf", bookshelf);
        return "bookshelf/index";
    }


    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String remove(Model model) {
        model.addAttribute("title","Remove a Book");
        return "bookshelf/remove";
    }


    @RequestMapping(value = "authors", method = RequestMethod.GET)
    public String authors(Model model) {
        model.addAttribute("title","Authors");
        return "bookshelf/authors";
    }


    @RequestMapping(value = "titles", method = RequestMethod.GET)
    public String titles(Model model) {
        model.addAttribute("title","Titles");
        return "bookshelf/titles";
    }


    @RequestMapping(value = "about", method = RequestMethod.GET)
    public String about(Model model) {
        model.addAttribute("title","About");
        return "bookshelf/about";
    }

}
