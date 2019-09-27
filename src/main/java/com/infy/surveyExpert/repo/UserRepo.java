package com.infy.surveyExpert.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.surveyExpert.entity.UserEntity;
import com.infy.surveyExpert.model.UserModel;
@Repository
public interface UserRepo  extends JpaRepository<UserModel,Integer> {
	UserEntity findByuserId(Integer userId) ;
	String login(String userId,String password);
}
