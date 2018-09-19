package com.lmg.Spring.struct2.actions;

import com.lmg.Spring.struct2.service.PersonService;

public class PersonAction {
	
	private PersonService personService;
	
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	
	public String execute(){
		System.out.println("execute...");
		personService.save();
		return "success";
	}
}