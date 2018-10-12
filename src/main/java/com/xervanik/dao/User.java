package com.xervanik.dao;

import javax.persistence.Entity;

/**
 * <h1>User</h1>
 * User class for people using the system,
 * logging in, managing issues
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-12
 */
@Entity
public class User extends Base{

    private String firstName;
    private String lastName;
    private String email;

/*    @ManyToMany
    private List<Skill> skills;*/

    public User() {
        super();
    }
}
