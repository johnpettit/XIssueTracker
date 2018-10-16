package com.xervanik.service;

import com.xervanik.dao.repository.IssueRepository;
import com.xervanik.dao.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IssueService {

    @Autowired
    IssueRepository issueRepo;

    public IssueService() {
        super();
    }

    public List<Issue> getAll() {
        return issueRepo.findAll();
    }

    public Issue addNew(Issue issue) {
        return issueRepo.save(issue);
    }
}
