package com.clubboxrest.model;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="\"match\"")
public class Match extends GenericEvent{
	
	
	private static final long serialVersionUID = 1L;

	@Column(name="\"teamHome\"")
	private Integer teamHome;
	@Column(name="\"teamAway\"")
	private Integer teamAway;
	@Column(name="\"scoreHome\"")
    private Integer scoreHome;
	@Column(name="\"scoreAway\"")
    private Integer scoreAway;
	@Column(name="\"resumeHome\"")
    private String resumeHome;
	@Column(name="\"resumeAway\"")
    private String resumeAway;

    public static class List extends ArrayList<Match> {
        private static final long serialVersionUID = 5L;
    }
    public Match(){
    	
    }
    public Match(Integer id, String date, String time, String place, String address, Long zipcode, String city, Integer teamHome, Integer teamAway, Integer scoreHome, Integer scoreAway, String resumeHome, String resumeAway) {
        super(id, date, time, place, address, zipcode, city);
        this.teamHome = teamHome;
        this.teamAway = teamAway;
        this.scoreHome = scoreHome;
        this.scoreAway = scoreAway;
        this.resumeHome = resumeHome;
        this.resumeAway = resumeAway;
    }


    public Integer getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(Integer teamHome) {
        this.teamHome = teamHome;
    }

    public Integer getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(Integer teamAway) {
        this.teamAway = teamAway;
    }

    public Integer getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(Integer scoreHome) {
        this.scoreHome = scoreHome;
    }

    public Integer getScoreAway() {
        return scoreAway;
    }

    public void setScoreAway(Integer scoreAway) {
        this.scoreAway = scoreAway;
    }

    public String getResumeHome() {
        return resumeHome;
    }

    public void setResumeHome(String resumeHome) {
        this.resumeHome = resumeHome;
    }

    public String getResumeAway() {
        return resumeAway;
    }

    public void setResumeAway(String resumeAway) {
        this.resumeAway = resumeAway;
    }
}
