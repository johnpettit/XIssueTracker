package com.xervanik.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import com.xervanik.dao.Issue;
import com.xervanik.dao.User;
import com.xervanik.service.IssueService;
import com.xervanik.service.UserService;
import java.util.List;

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

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    IssueService issueService;

    @Autowired
    UserService userService;

    @RequestMapping(value="/issues",method=RequestMethod.GET)
    public String issue(Model model) {
        List<Issue> issues = issueService.getAll();
        model.addAttribute("issues", issues);
        return "issues.html";
    }

    @RequestMapping(value="/issues/add",method=RequestMethod.GET)
    public String addIssue(Model model) {
        model.addAttribute("issue", new Issue());
        return "addissue.html";
    }

    @RequestMapping(value = "/addissue", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute Issue issue, Model model) {

        //issue.getOwnerId().setEmail("test@test.com");

        User user = new User();
        user.setEmail("blah@blah.com");
        user.setFirstName("John");
        user.setLastName("Pettit");
        user.setPassword("chuck111");
        userService.addNew(user);

        issue.setOwnerId(user);
        issueService.addNew(issue);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        //UserDetails user = ((UserDetails)authentication.getPrincipal());

        //logger.info(user.getUsername());

        List<Issue> issues = issueService.getAll();
        model.addAttribute("issues", issues);
        return "issues.html";
    }
}

