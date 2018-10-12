package com.xervanik.dao;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
/**
 * <h1>Issue</h1>
 * Issue class for the things to be tracked
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-12
 */
@Entity
public class Issue extends Base {

    private String title;

    @OneToOne
    private User ownerId;

    public Issue() {
        super();
    }
}
