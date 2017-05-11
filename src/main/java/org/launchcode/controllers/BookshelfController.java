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
        return "bookshelf/index";
    }
}
