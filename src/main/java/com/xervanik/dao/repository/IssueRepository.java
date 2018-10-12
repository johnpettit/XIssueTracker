package com.xervanik.dao.repository;

import com.xervanik.dao.Issue;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue, Long> {

    List<Issue> findByTitle(String title);
}