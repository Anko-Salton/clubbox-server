package com.clubboxrest.config;

import org.springframework.stereotype.Component;

@Component
public class Param {
	
	private String domaine_prod 	= "";
	private String serverip 		= "";
	
	
	public String getDomaine_prod() {
		return domaine_prod;
	}
	public void setDomaine_prod(String domaine_prod) {
		this.domaine_prod = domaine_prod;
	}
	public String getServerip() {
		return serverip;
	}
	
	public void setServerip(String serverip) {
		this.serverip = serverip;
	}
	
	
}
