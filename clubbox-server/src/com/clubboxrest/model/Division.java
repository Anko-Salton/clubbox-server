package com.clubboxrest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by cdsm16 on 12/04/2016.
 */
@Entity
@Table(name="division")
public class Division implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@Column(name="name")
    private String name;
    @OneToOne
    @JoinColumn(name="category")
    private Category dept;

    public Division(Integer id, String name, Category dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getDept() {
        return dept;
    }

    public void setDept(Category dept) {
        this.dept = dept;
    }
}
