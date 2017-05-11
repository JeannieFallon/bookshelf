package org.launchcode.controllers;

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
        String test = "Bookshelf test";
        model.addAttribute("test", test);
        return "bookshelf/index";
    }
}
