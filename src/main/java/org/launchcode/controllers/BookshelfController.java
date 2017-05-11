package org.launchcode.controllers;

import org.launchcode.models.Bookshelf;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jeannie on 5/10/17.
 */
@Controller
@RequestMapping(value = "bookshelf")
public class BookshelfController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        Bookshelf fiction = new Bookshelf("Fiction");
        fiction.addBook("Silver Linings Playbook", "Matthew Quick");
        fiction.addBook("Brave New World", "Aldous Huxley");
        fiction.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        model.addAttribute("bookshelf", fiction);
        model.addAttribute("title", "Books");
        return "bookshelf/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("title","Add a Book");
        return "bookshelf/add";
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
