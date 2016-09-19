package com.clubboxrest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.clubboxrest.model.User;
import com.clubboxrest.model.mapper.UserInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller("securityController")
public class SecurityController {
	@Autowired
	UserInterface userInterface;

	@RequestMapping(value="/connect.php")
	@ResponseBody 
	public Object callback_connect(ModelAndView model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		/**
		 * \brief	Set version in this session
		 */
		
		String login = SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("login : "+login);
		User customerWeb = userInterface.findUserByEmail(login);
		Gson gson = new GsonBuilder().create();
		String customerWebAndContactsJson = gson.toJson(customerWeb);
		return customerWebAndContactsJson;
	}
	

}