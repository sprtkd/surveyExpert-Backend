package com.infy.surveyExpert.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infy.surveyExpert.model.DescriptiveAnswerable;
import com.infy.surveyExpert.model.DiscreteAnswerable;
import com.infy.surveyExpert.model.Survey;
import com.infy.surveyExpert.model.SurveyAttempted;
import com.infy.surveyExpert.model.User;
import com.infy.surveyExpert.service.UserService;

@RestController
@RequestMapping("/users")
public class UserAPI {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/getprofile/{userId}")
	public ResponseEntity<User> getUserProfile(@PathVariable Integer userId) throws Exception {
		User userModel = userService.getUserProfile(userId);
		System.out.println(userModel);
		ResponseEntity<User> response = new ResponseEntity<User>(userModel, HttpStatus.OK);
		return response;
	}
	
	@GetMapping(value = "/getAllSurveys")
	public ResponseEntity getAllSurveys() throws Exception
	{
		
		List<Survey> li=userService.getAllSurveys();
		
		ResponseEntity response = new ResponseEntity<>(li, HttpStatus.OK);
		return response;
	}
	@GetMapping(value = "/getAllSurveysAttempted/{userId}")
	public ResponseEntity getAllSurveysAttempted(@PathVariable Integer userId) throws Exception
	{
		
		List<SurveyAttempted> li=userService.getAllAttemptedSurveyByUser(userId);
		
		ResponseEntity response = new ResponseEntity<>(li, HttpStatus.OK);
		return response;
	}
	
	@PostMapping(value = "/createSurvey/{userId}")
	public ResponseEntity<String> createSurvey(@PathVariable Integer userId,@RequestBody List<DescriptiveAnswerable> descriptiveAnswerables) {
		String message=userService.createSurveyForDescriptive(descriptiveAnswerables);
		ResponseEntity<String> response = new ResponseEntity<String>(message + ":" ,HttpStatus.OK);
		return response;
	}
	
	

	
}
