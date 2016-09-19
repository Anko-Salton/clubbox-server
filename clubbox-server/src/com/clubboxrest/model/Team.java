package com.clubboxrest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.mapping.Collection;

/**
 * Created by cdsm16 on 12/04/2016.
 */
@Entity
@Table(name="\"team\"")
public class Team implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@OneToOne
	@JoinColumn(name="\"club\"")
    private Club club;
	@Column(name="\"name\"")
    private String name;
	@OneToOne
	@JoinColumn(name="\"division\"")
    private Division division;
	@OneToOne
	@JoinColumn(name="\"category\"")
	private Category category;


	public Team(){
		
	}
	
    public Team(Integer id) {
        this.id = id;
    }

    public Team(Integer id, Club club, String name, Division division) {
        this.id = id;
        this.club = club;
        this.name = name;
        this.division = division;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
