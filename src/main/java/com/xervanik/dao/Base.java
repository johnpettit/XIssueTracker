package com.xervanik.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * <h1>Base</h1>
 * Base class forall entities
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-12
 */
public class Base {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    public Base() {
        super();
    }
}
