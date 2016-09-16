package com.clubboxrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clubboxrest.model.Club;
import com.clubboxrest.model.User;
import com.clubboxrest.model.mapper.UserInterface;

@Controller("userManageController")
public class UserManageController {

	@Autowired
	UserInterface userInterface;

	@RequestMapping(value="/user/save")
	@ResponseBody
	public String registerNewUser(@RequestParam String name,@RequestParam String email,@RequestParam String password,@RequestParam String phone,@RequestParam(required=false) String profilePhoto,Long clubId){
		try{
			User newUser = new User();
			newUser.setEmail(email);
			newUser.setName(name);
			newUser.setLevel(0);
			newUser.setPassword(password);
			newUser.setProfilePhoto(profilePhoto==null?"":profilePhoto);
			newUser.setBirthdate("");
			newUser.setClub(new Club(clubId));
			userInterface.save(newUser);
			return "OK";
		}catch(Exception e){
			return "KO";
		}
	}
}

