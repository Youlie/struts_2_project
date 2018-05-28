package com.aplose.actions;

import com.opensymphony.xwork2.ActionSupport;

public class TestLoginAction extends ActionSupport {

	
	String login;
	String mdp;
	
	public void validate() {
		if(login.length()<6 ) {
			addFieldError("login", "Attention le login est de moins de 6 caractères !");
		}
		if(mdp.length()<6 ) {
			addFieldError("mdp", "Attention le mdp est de moins de 6 caractères !!");
		}
	}
	public String execute() {

		if (login.equals("boubou") && mdp.equals("boubou")) {
			return "success";
		}

		return "error";

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

}
