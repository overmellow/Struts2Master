package com.wv.mfaraji.action;

import com.opensymphony.xwork2.Action;
import com.wv.mfaraji.service.TutorialService;

public class TutorialAction implements Action {

	private TutorialService tutorialService;
	private String tutorialName;
	private String language;
	
	public TutorialAction() {
		this.tutorialService = new TutorialService();
	}
	
	public String execute() {		
		setTutorialName(this.tutorialService.getTutorialName(getLanguage()));
		System.out.println("Hello from execute");
		System.out.println(getLanguage());
		return SUCCESS;
	}

	public String getTutorialName() {
		return tutorialName;
	}

	public void setTutorialName(String tutorialName) {
		this.tutorialName = tutorialName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
