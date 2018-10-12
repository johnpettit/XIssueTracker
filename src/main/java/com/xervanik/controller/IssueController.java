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
 * <h1>IssueController</h1>
 * IssueController for doing User operations
 *
 * RESTful
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-12
 */
@Controller
public class IssueController {
    @Autowired
    IssueRepository repository;

    @RequestMapping("/issues/{id}")
    public String issue(@PathVariable Long id, Model model) {
        //model.addAttribute("user", repository.findById(id));
        model.addAttribute("name", "FRED");
        return "issues";
    }
}
