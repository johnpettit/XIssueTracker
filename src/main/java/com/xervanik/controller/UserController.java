package com.xervanik.controller;

import com.xervanik.dao.User;
import com.xervanik.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

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

    @Autowired
    UserService userService;

    @RequestMapping(value="/users",method=RequestMethod.GET)
    public String developersList(Model model) {
        model.addAttribute("name", "users");
        return "users.html";
    }

    @RequestMapping(value="/users/add",method=RequestMethod.GET)
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "adduser.html";
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute User user, Model model) {

        userService.addNew(user);

        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        return "users.html";
    }
}
