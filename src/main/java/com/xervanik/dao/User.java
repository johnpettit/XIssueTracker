package com.xervanik.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

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

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    private String password;


    public User() {
        super();
    }

    public User(String fName, String lName, String em) {
        this.firstName = fName;
        this.lastName = lName;
        this.email = em;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
