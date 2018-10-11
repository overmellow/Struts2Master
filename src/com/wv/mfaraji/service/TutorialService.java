package com.wv.mfaraji.service;

public class TutorialService {

	public String getTutorialName(String language) {
		if(language.equals("java")) {
			return "Struts 2 Tutorial";
		} else {
			return "w3schools";
		}		
	}

}
