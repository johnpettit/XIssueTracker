package com.xervanik.service;

import com.xervanik.dao.Issue;
import com.xervanik.dao.repository.UserRepository;
import com.xervanik.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * <h1>UserService</h1>
 * UserService for doing User operations
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-15
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public UserService() {
        super();
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public User getById(long id) {
        return userRepo.findById(id);
    }


    public User addNew(User user) {
        return userRepo.save(user);
    }
}
