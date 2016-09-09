package com.clubboxrest.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class News implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@OneToOne
	@JoinColumn(name="\"club\"")
    private Club club;
	@Column(name="\"dateadd\"")
    private String dateadd;
	@Column(name="\"title\"")
    private String title;
	@Column(name="\"content\"")
    private String content;

    public News(){
    	
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

    public String getDateFormatFR() {
        DateFormat f = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.getDefault());
        String formattedDate = "";
		try {
			formattedDate = f.format(f.parse(this.dateadd));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return (formattedDate);
    }

    public String getDateadd() {
        return dateadd;
    }

    public void setDateadd(String dateadd) {
        this.dateadd = dateadd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NewsActivity{" +
                "id=" + id +
                ", club=" + club +
                ", dateadd=" + dateadd +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
