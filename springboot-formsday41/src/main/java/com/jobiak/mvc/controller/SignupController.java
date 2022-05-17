package com.jobiak.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvc.model.User;
import com.jobiak.mvc.repository.UserRepository;
//import com.jobiak.springmvcjsp.controller.SignupController;


@Controller
public class SignupController
{
	//Logger logger = LoggerFactory.getLogger(SignupController.class);
	@Autowired
	UserRepository repo;
	
	public SignupController() {
		// TODO Auto-generated constructor stub
	}
	

	public SignupController(UserRepository repo) {
		this.repo = repo;
	}


	@RequestMapping(path="/test",method=RequestMethod.GET)
    public String redirect()
	{
		return "signup";
	}

	@RequestMapping(path="/signup",method=RequestMethod.POST)
	public String doSignUp(@ModelAttribute("user")User user) {
		
		System.out.println(user.getUserId()+user.getName());
		repo.save(user);
		return "success";

	}
}
