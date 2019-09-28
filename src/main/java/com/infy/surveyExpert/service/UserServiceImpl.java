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
import com.infy.surveyExpert.repo.DiscreteAnswerableRepo;
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
	private DiscreteAnswerableRepo discreteAnswerableRepo;
	
	@Autowired
	private DescriptiveAnswerableRepo descriptiveAnswerableRepo;
	
	@Autowired
	private SurveyAttemptedRepo surveyAttemptedrep;
	@Autowired
	private ParticipantRepo participantRepo;

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
		 System.out.println(p.getUser().getEmailId()+"part");
		 List<SurveyAttemptedEntity> li= surveyAttemptedrep.findAllByParticipant(p);
		 List<SurveyAttempted> li1=new ArrayList<SurveyAttempted>();
		 for(SurveyAttemptedEntity s:li) {
			 li1.add(SurveyAttemptedEntity.toModel(s));
		 }
		 return li1;
	 }

	@Override
	public List<Question> getAllQuestionsInSurvey(Integer surveyId) throws Exception {
		// TODO Auto-generated method stub
		Optional<SurveyEntity> surveyEntity = surveyRep.findById(surveyId);
		SurveyEntity surveyEntity2 = new SurveyEntity();
		if (surveyEntity.isPresent()) {
			surveyEntity2=surveyEntity.get();
		}
		List<QuestionEntity> questionEntities = questionRepo.findBySurvey(surveyEntity2);
		List<Question> questions = new ArrayList<>();
		for (QuestionEntity q:questionEntities) {
			questions.add(QuestionEntity.toModel(q));
		}
		return questions;
	}

	@Override
	public List<DiscreteAnswerable> getAllDiscreteAnswerablesInSurvey(Integer surveyId) throws Exception {
		// TODO Auto-generated method stub
		Optional<SurveyEntity> surveyEntity = surveyRep.findById(surveyId);
		SurveyEntity surveyEntity2 = new SurveyEntity();
		if (surveyEntity.isPresent()) {
			surveyEntity2=surveyEntity.get();
		}
		List<QuestionEntity> questionEntities = questionRepo.findBySurvey(surveyEntity2);
		List<Question> questions = new ArrayList<>();
		List<DiscreteAnswerable> discreteAnswerables = new ArrayList<>();
		for (QuestionEntity q:questionEntities) {
			Question question = QuestionEntity.toModel(q);
			questions.add(question);
			if (q.getQuestionType()=="1") {
				discreteAnswerables.add(DiscreteAnswerableEntity.toModel(discreteAnswerableRepo.findByQuestion(q)));
			}
		}
		return discreteAnswerables;
	}

	@Override
	public List<DescriptiveAnswerable> getAllDescriptiveAnswerablesInSurvey(Integer surveyId) throws Exception {
		// TODO Auto-generated method stub
		Optional<SurveyEntity> surveyEntity = surveyRep.findById(surveyId);
		SurveyEntity surveyEntity2 = new SurveyEntity();
		if (surveyEntity.isPresent()) {
			surveyEntity2=surveyEntity.get();
		}
		List<QuestionEntity> questionEntities = questionRepo.findBySurvey(surveyEntity2);
		List<Question> questions = new ArrayList<>();
		List<DescriptiveAnswerable> descriptiveAnswerables = new ArrayList<>();
		for (QuestionEntity q:questionEntities) {
			Question question = QuestionEntity.toModel(q);
			questions.add(question);
			if (q.getQuestionType()=="2") {
				descriptiveAnswerables.add(DescriptiveAnswerableEntity.toModel(descriptiveAnswerableRepo.findByQuestion(q)));
			}
		}
		return descriptiveAnswerables;
	}
}
