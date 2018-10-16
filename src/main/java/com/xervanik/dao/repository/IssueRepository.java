package com.xervanik.dao.repository;

import com.xervanik.dao.Issue;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * <h1>IssueRepository</h1>
 * IssueRepository class for accessing DB
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-12
 */
public interface IssueRepository extends CrudRepository<Issue, Long> {

    List<Issue> findByTitle(String title);

    List<Issue> findAll();

    Issue save(Issue issue);
}