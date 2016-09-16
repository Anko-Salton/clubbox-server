package com.clubboxrest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"club\"")
public class Club implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column(name="\"name\"", nullable=false)
    private String name;
	@Column(name="\"address\"", nullable=false)
    private String address;
	@Column(name="\"zipcode\"", nullable=false)
    private Long zipcode;
	@Column(name="\"city\"", nullable=false)
    private String city;
	@Column(name="\"logoPath\"")
    private String logoPath;
	@Column(name="\"isValidate\"")
    private boolean isValidate;

    public Club(){
    	
    }
    
    public Club(Long id) {
        this.id = id;
    }

    public Club(Long id, String name, String address, Long zipcode, String city, String logoPath, boolean isValidate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.logoPath = logoPath;
        this.isValidate = isValidate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public boolean isValidate() {
        return isValidate;
    }

    public void setIsValidate(boolean isValidate) {
        this.isValidate = isValidate;
    }
}
