package com.xervanik.dao.repository;

import com.xervanik.dao.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * <h1>UserRepository</h1>
 * UserRepository class for accessing DB
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-12
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findById(long id);

    List<User> findAll();

    User save(User user);
}

