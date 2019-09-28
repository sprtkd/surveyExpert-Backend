package com.infy.surveyExpert.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.surveyExpert.entity.UserEntity;
import com.infy.surveyExpert.model.User;


public interface UserRepo  extends JpaRepository<UserEntity,Integer> {
	Optional<UserEntity> findById(Integer userId) ;
	
}
