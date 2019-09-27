package com.infy.surveyExpert.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infy.surveyExpert.model.UserModel;
import com.infy.surveyExpert.service.UserService;

@RestController
public class UserAPI {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getprofile/{userId}", method = RequestMethod.GET)
	public ResponseEntity<UserModel> getUserProfile(@PathVariable Integer userId) throws Exception {
		UserModel userModel = userService.getUserProfile(userId);
		System.out.println(userModel);
		ResponseEntity<UserModel> response = new ResponseEntity<UserModel>(userModel, HttpStatus.OK);
		return response;
	}
	
	@RequestMapping(value = "/login/{userId}", method = RequestMethod.GET)
	public ResponseEntity<String> userLogin(@PathVariable String userId,@RequestBody String password) throws Exception {
		String message = userService.userLogin(userId,password);
		System.out.println(message);
		ResponseEntity<String> response = new ResponseEntity<String>(message, HttpStatus.OK);
		return response;
	}
}
