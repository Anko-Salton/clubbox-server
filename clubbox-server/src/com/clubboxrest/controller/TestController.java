package com.clubboxrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clubboxrest.model.mapper.UserInterface;
import com.google.gson.GsonBuilder;

@Controller
public class TestController {

	@Autowired
	private UserInterface userInterface;
	
	@RequestMapping(value="/user")
	@ResponseBody
	public String allUser(){
		return new GsonBuilder().create().toJson(userInterface.findAll());
	}
	@RequestMapping(value = "/user/{id}")
	@ResponseBody
	public String aUser(@PathVariable Integer id){
		return  new GsonBuilder().create().toJson(userInterface.findOne(id)); 
	}
	

}
