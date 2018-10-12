package com.xervanik.controller;

import com.xervanik.dao.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

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
    UserRepository repository;

    @RequestMapping("/users/{id}")
    public String developer(@PathVariable Long id, Model model) {
        //model.addAttribute("user", repository.findById(id));
        model.addAttribute("name", "FRED");
        return "users";
    }

    @RequestMapping(value="/users",method=RequestMethod.GET)
    public String developersList(Model model) {
        model.addAttribute("users", repository.findAll());
        return "developers";
    }

    /*
    @RequestMapping(value="/developers",method=RequestMethod.POST)
    public String developersAdd(@RequestParam String email,
                                @RequestParam String firstName, @RequestParam String lastName, Model model) {
        Developer newDeveloper = new Developer();
        newDeveloper.setEmail(email);
        newDeveloper.setFirstName(firstName);
        newDeveloper.setLastName(lastName);
        repository.save(newDeveloper);

        model.addAttribute("developer", newDeveloper);
        model.addAttribute("skills", skillRepository.findAll());
        return "redirect:/developer/" + newDeveloper.getId();
    }
*/
}
