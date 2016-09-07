package com.clubboxrest.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

/**
 * Created by cdsm16 on 12/04/2016.
 */
@Entity
@Inheritance
@Table(name="genericevent")
public abstract class GenericEvent  implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@Column(name="date")
    private String date;
	@Column(name="time")
    private String time;
	@Column(name="place")
    private String place;
	@Column(name="address")
    private String address;
	@Column(name="zipcode")
    private Long zipcode;
	@Column(name="city")
    private String city;

	public GenericEvent(){
		
	}
    public GenericEvent(Integer id) {
        this.id = id;
    }

    public GenericEvent(Integer id, String date, String time, String place, String address, Long zipcode, String city) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.place = place;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getZipcode() {
        return zipcode;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

