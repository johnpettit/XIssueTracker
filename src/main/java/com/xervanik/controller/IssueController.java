package com.xervanik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <h1>IssueController</h1>
 * IssueController for doing User operations
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-12
 */
@Controller
public class IssueController {

    @RequestMapping(value="/issues",method=RequestMethod.GET)
    public String issue(Model model) {
        model.addAttribute("name","issues");
        return "issues.html";
    }

    @RequestMapping(value="/issues/add",method=RequestMethod.GET)
    public String addIssue(Model model) {
        model.addAttribute("name","ADD");
        return "addissues.html";
    }
}
