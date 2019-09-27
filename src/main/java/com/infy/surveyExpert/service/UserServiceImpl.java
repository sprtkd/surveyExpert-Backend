package com.infy.surveyExpert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.infy.surveyExpert.dao.UserDAO;
import com.infy.surveyExpert.model.User;
=======
import com.infy.surveyExpert.entity.UserEntity;
import com.infy.surveyExpert.model.UserModel;
import com.infy.surveyExpert.repo.UserRepo;
>>>>>>> branch 'master' of https://github.com/sprtkd/surveyExpert-Backend.git

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
<<<<<<< HEAD
	public User getUserProfile(Integer userId) throws Exception {
		User userModel = userDAO.getUserProfile(userId);
		return userModel;
=======
	public UserModel getUserProfile(Integer userId) throws Exception {
		UserEntity user = userRepo.findByuserId(userId);
		return new UserModel();
>>>>>>> branch 'master' of https://github.com/sprtkd/surveyExpert-Backend.git
	}
		
}
