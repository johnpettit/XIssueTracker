package com.xervanik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import com.xervanik.dao.Issue;
import com.xervanik.service.IssueService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    IssueService issueService;

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

        issueService.addNew(issue);

        logger.info("Adding new Issue:" + issue.getTitle());

        List<Issue> issues = issueService.getAll();
        model.addAttribute("issues", issues);
        return "issues.html";
    }
}

