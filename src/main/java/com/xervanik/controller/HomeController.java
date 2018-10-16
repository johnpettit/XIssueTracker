package com.xervanik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <h1>HomeController</h1>
 * HomeController for doing Home operations
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-15
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "home.html";
    }
}