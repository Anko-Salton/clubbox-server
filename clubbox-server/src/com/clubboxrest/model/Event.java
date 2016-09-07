package com.clubboxrest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by cdsm16 on 12/04/2016.
 */
@Entity
@Table(name="event")
public class Event extends GenericEvent {
	
	@OneToOne
	@JoinColumn(name="club")
    private Club club;
	@Column(name="name")
    private String name;
	@Column(name="description")
    private String description;

	public Event(){
		super();
	}
    public Event(Integer id, String date, String time, String place, String address, Long zipcode, String city, Club club, String name, String description) {
        super(id, date, time, place, address, zipcode, city);
        this.club = club;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
