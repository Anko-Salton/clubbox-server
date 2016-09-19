package com.clubboxrest.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.clubboxrest.model.User;
import com.clubboxrest.model.mapper.UserInterface;


@Component("authenticationManagerUserDetail")
public class AuthenticationManagerUserDetail implements UserDetailsService {
	
	@Autowired
	UserInterface userInterface;
	
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		// Init CustomerWeb
		User customerWeb = new User();

		try{
			System.out.println("CUSTOMER : " + login);
			// Parse login
			String[] tmps = login.split("_");
			// Recuperation password Request
			customerWeb = userInterface.findUserByEmail(login);
			// Test si User trouve avec le login existe ou non
			if(customerWeb == null){
				throw new UsernameNotFoundException("User not valid : " + login);
			}else{
				// UPDATE LASTCONNECTION
				//Construction User avec ses Rôles
				return makeUser(customerWeb);
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("CUSTOMER NOT CREATE " + e.toString());
			return null;
		}
	}

	private org.springframework.security.core.userdetails.User makeUser(User customerWeb) {
		/**
		 * \brief		En charge de créer un User de type org.springframework.security.userdetails.User avec son login et son mot de passe
		 * \param		User : Client recherché auparavant
		 * \return		Un User avec l'ensemble de ses droits (interfacé avec Spring Security)
		 */
		org.springframework.security.core.userdetails.User tmp = new org.springframework.security.core.userdetails.User(customerWeb.getEmail(), customerWeb.getPassword(), true, true, true, true, makeGrantedAuthorities(customerWeb));
		return tmp;
	}

	private Collection<GrantedAuthority> makeGrantedAuthorities(User customerWeb){
		/**
		 * \brief		En charge de rechercher les roles du user passé en paramètre
		 * \param		User : Client recherché auparavant
		 */
		Collection<GrantedAuthority> returns = new ArrayList<GrantedAuthority>();

		/*
		 *  INIT ROLE USER
		 */
		try{
			returns.add(new SimpleGrantedAuthority("ROLE_PER"));

		}catch(NullPointerException e){e.printStackTrace();}

		return returns;
	}

}
