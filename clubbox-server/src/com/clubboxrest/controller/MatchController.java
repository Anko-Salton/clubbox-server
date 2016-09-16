package com.clubboxrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clubboxrest.model.Match;
import com.clubboxrest.model.mapper.MatchInterface;
import com.clubboxrest.model.mapper.UserInterface;
import com.google.gson.GsonBuilder;

@Controller("matchController")
public class MatchController {
	
	@Autowired
	UserInterface userInterface;
	@Autowired
	MatchInterface matchInterface;
	
	@RequestMapping(value="/match/updateScore",method=RequestMethod.GET)
	@ResponseBody
	public String match_update_score(@RequestParam Integer id, @RequestParam Integer scoreHome,@RequestParam Integer scoreAway){
		Match match = matchInterface.findOne(id);
		if(match != null){
			match.setScoreHome(scoreHome);
			match.setScoreAway(scoreAway);
			matchInterface.save(match);
		}
		return new GsonBuilder().create().toJson(match);
	}
}
