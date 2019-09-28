package com.infy.surveyExpert.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.surveyExpert.entity.ParticipantEntity;
import com.infy.surveyExpert.entity.QuestionEntity;
import com.infy.surveyExpert.entity.SurveyAttemptedEntity;
import com.infy.surveyExpert.entity.SurveyEntity;
import com.infy.surveyExpert.entity.UserEntity;
import com.infy.surveyExpert.model.DescriptiveAnswerable;
import com.infy.surveyExpert.model.DiscreteAnswerable;
import com.infy.surveyExpert.model.Question;
import com.infy.surveyExpert.model.Survey;
import com.infy.surveyExpert.model.SurveyAttempted;
import com.infy.surveyExpert.model.User;
import com.infy.surveyExpert.repo.DescriptiveAnswerableRepo;
import com.infy.surveyExpert.repo.ParticipantRepo;
import com.infy.surveyExpert.repo.QuestionRepo;
import com.infy.surveyExpert.repo.SurveyAttemptedRepo;
import com.infy.surveyExpert.repo.SurveyRep;
import com.infy.surveyExpert.repo.UserRepo;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private QuestionRepo questionRepo;
	
	@Autowired
	private DescriptiveAnswerableRepo descriptiveAnswerableRepo;
	@Autowired
	private SurveyAttemptedRepo surveyAttemptedrep;
	@Autowired
	private ParticipantRepo participantRepo;
	@Autowired
	private SurveyRep surveyRep;

	public User getUserProfile(Integer userId) throws Exception {


		Optional<UserEntity> useren = userRepo.findById(userId);
		if(useren.isPresent()) {
			return User.toModel(useren.get());
		}
		
		else {
			throw new Exception("NO Data Found");
		}


	}
	
	public List<Question> getAllQuestion(Survey survey) throws Exception{
		
		List<QuestionEntity> questionEntity = questionRepo.findBySurvey(survey);
		List<Question> qlist = new ArrayList<Question>();
		for(QuestionEntity q: questionEntity)
		{
			qlist.add(QuestionEntity.toModel(q));
		}
		return qlist;
	}
	
	
	public List<Survey> getAllSurveys()throws Exception{
		List<SurveyEntity>li=surveyRep.findAll();
		List<Survey> li1=new ArrayList<Survey>();
		for(SurveyEntity s:li) {
			li1.add(SurveyEntity.toModel(s));
		}
		return li1;
		
	}

	 public List<SurveyAttempted> getAllAttemptedSurveyByUser(Integer userId) throws Exception{
		 Optional<UserEntity> useren = userRepo.findById(userId);
		 User u=new User();
		 UserEntity u1=new UserEntity();
		 if(useren.isPresent()) {
			 u1=useren.get();
				 u=User.toModel(useren.get());
			}
		 System.out.println(u.getName()+"name");
		 
		 ParticipantEntity p=participantRepo.findByUser(u1);
		
		 List<SurveyAttemptedEntity> li= surveyAttemptedrep.findAllByParticipant(p);
		 List<SurveyAttempted> li1=new ArrayList<SurveyAttempted>();
		 for(SurveyAttemptedEntity s:li) {
			 li1.add(SurveyAttemptedEntity.toModel(s));
		 }
		 return li1;
	 }

	@Override
	public String createSurveyForDescriptive(List<DescriptiveAnswerable> descriptiveAnswerables) {
		List<Integer> list=new ArrayList();
		for(DescriptiveAnswerable descriptiveAnswerable:descriptiveAnswerables) {
			list.add(descriptiveAnswerableRepo.save(DescriptiveAnswerable.toEntity(descriptiveAnswerable)).getDummy());
		}
		String message="survey created successfully with id's:";
		for(Integer i:list) {
			message+=" "+i;
		}
		return message ;
		
	}

	@Override
	public String createSurveyForDesciptive(List<DiscreteAnswerable> discreteAnswerables) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
