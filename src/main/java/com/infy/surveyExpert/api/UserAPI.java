package com.infy.surveyExpert.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infy.surveyExpert.model.User;
import com.infy.surveyExpert.service.UserService;

@RestController
@RequestMapping("/users")
public class UserAPI {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getprofile/{userId}", method = RequestMethod.GET)
	public ResponseEntity<User> getUserProfile(@PathVariable Integer userId) throws Exception {
		User userModel = userService.getUserProfile(userId);
		System.out.println(userModel);
		ResponseEntity<User> response = new ResponseEntity<User>(userModel, HttpStatus.OK);
		return response;
	}
	
	
}
