package com.xervanik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h1>UserController</h1>
 * UserController for doing User operations
 *
 * RESTful
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-12
 */
@Controller
public class UserController {

    @RequestMapping(value="/users",method=RequestMethod.GET)
    public String developersList(Model model) {
        model.addAttribute("name", "users");
        return "users.html";
    }

    @RequestMapping(value="/users/add",method=RequestMethod.GET)
    public String addUser(Model model) {
        model.addAttribute("name", "ADD USER");
        return "addusers.html";
    }
}
