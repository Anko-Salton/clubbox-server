package com.clubboxrest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "user")
public class User implements Serializable {

    public static class List extends ArrayList<User> {
        private static final long serialVersionUID = 7L;
    }

    @Id				@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(name="email",nullable=true)
    private String email;
    @Column(name="pass",nullable=true)
    private String password;
    @Column(name="name",nullable=true)
    private String name;
    @Column(name="birthdate",nullable=true)
    private String birthdate;
    @Column(name="phone",nullable=true)
    private String phone;
    @Column(name="profilePhoto",nullable=true)
    private String profilePhoto;
    @Column(name="level",nullable=true)
    private Integer level;
    @OneToOne
    @JoinColumn(name="clubId")
    private Club club;

    public User() {
    	
    }
    
    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String email, String password, String name, String forname, String birthdate, String phone, String profilePhoto, Integer level) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.birthdate = birthdate;
        this.phone = phone;
        this.profilePhoto = profilePhoto;
        this.level = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}
}
