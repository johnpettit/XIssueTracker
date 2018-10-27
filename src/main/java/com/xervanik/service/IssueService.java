package com.xervanik.service;

import com.xervanik.dao.repository.IssueRepository;
import com.xervanik.dao.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * <h1>IssueService</h1>
 * IssueService for doing Issue operations
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-15
 */
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

    public Issue getById(long id) {
        return issueRepo.findById(id);
    }

    public Issue addNew(Issue issue) {
        return issueRepo.save(issue);
    }
}
