package com.xervanik.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

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

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Date createDate;
    @OneToOne
    private User ownerId;

    public Issue() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(User ownerId) {
        this.ownerId = ownerId;
    }
}