package com.karsontest.myspringtest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karsontest.myspringtest.entity.User;
import com.karsontest.myspringtest.service.UserService;

@RestController
public class TestController {

	@Autowired
    private UserService userService;
	
	@RequestMapping(value = "/hello")
	public String test(){
		System.out.println("Hello");
		return "Log!!!!!!!!!!!!";
	}
	

 
    @RequestMapping(value = "/user")
    public List<User> hello(){
        List<User> userResult=null;
        userResult = userService.hello( );
        return userResult;
    }

 
	
}
