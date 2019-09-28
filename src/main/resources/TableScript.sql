
DROP DATABASE SURVEY ;
CREATE DATABASE SURVEY;
USE SURVEY;

CREATE TABLE USERS (
	EMAIL_ID VARCHAR(20),
	PASSWORD VARCHAR(20),
	NAME VARCHAR(20),
	ID INT AUTO_INCREMENT,
	ROLE VARCHAR(20),
	PRIMARY KEY (ID)
);

CREATE TABLE ORGANIZER (
	USER_ID INT REFERENCES USERS (ID),
	DUMMY INT AUTO_INCREMENT,
	PRIMARY KEY (DUMMY)
);

CREATE TABLE SURVEY (
	ORGANIZER_ID INT REFERENCES ORGANIZER (DUMMY),
	ID INT AUTO_INCREMENT,
	START_DATE DATE ,
	END_DATE DATE ,
	STATUS INT (1),
	PRIMARY KEY (ID)
);

CREATE TABLE QUESTION (
	SURVEY_ID INT REFERENCES SURVEY (ID),
	ID INT AUTO_INCREMENT,
	QUESTION_TYPE VARCHAR (10),
	QUESTION VARCHAR (255),
	PRIMARY KEY (ID)
);

CREATE TABLE DISCRETE_ANSWERABLE (
	QUESTION_ID INT REFERENCES QUESTION (ID),
	ID INT AUTO_INCREMENT,
	OPTION_TEXT VARCHAR (10),
	PRIMARY KEY (ID)
);

CREATE TABLE DESCRIPTIVE_ANSWERABLE (
	QUESTION_ID INT REFERENCES QUESTION (ID),
	DUMMY INT AUTO_INCREMENT,
	MEDIA_FILE_TYPE INT (1),
	MEDIA_FILE_LOCATION VARCHAR(255),
	PRIMARY KEY (DUMMY)
);

CREATE TABLE PARTICIPANT (
	ID INT REFERENCES USERS (ID),
	DUMMY INT AUTO_INCREMENT,
	PRIMARY KEY (DUMMY)
);

CREATE TABLE SURVEY_ATTEMPTED (
	ORGANIZER_ID INT REFERENCES ORGANIZER (ID),
	SURVEY_ID INT REFERENCES SURVEY (ID),
	PARTICIPANT_ID INT REFERENCES PARTICIPANT (ID),
	ATTEMPTED_TIMESTAMP TIMESTAMP NOT NULL,
	ID INT AUTO_INCREMENT,
	PRIMARY KEY (ID)
);

CREATE TABLE DISCRETE_ANSWERS (
	ORGANIZER_ID INT REFERENCES ORGANIZER (ID),
	SURVEY_ID INT REFERENCES SURVEY (ID),
	PARTICIPANT_ID INT REFERENCES PARTICIPANT (ID),
	QUESTION_ID INT REFERENCES DISCRETE_ANSWERABLE (QUESTION_ID),
	OPTION_ID INT REFERENCES DISCRETE_ANSWERABLE (ID),
	ID INT AUTO_INCREMENT,
	PRIMARY KEY (ID)
);



CREATE TABLE DESCRIPTIVE_ANSWERS (
	ORGANIZER_ID INT REFERENCES ORGANIZER (ID),
	SURVEY_ID INT REFERENCES SURVEY (ID),
	PARTICIPANT_ID INT REFERENCES PARTICIPANT (ID),
	QUESTION_ID INT REFERENCES DESCRIPTIVE_ANSWERABLE (QUESTION_ID),
	ANSWER_TEXT VARCHAR (255),
	MEDIA_FILE_TYPE INT (1),
	MEDIA_FILE_LOCATION VARCHAR(255),
	ID INT AUTO_INCREMENT,
	PRIMARY KEY (ID)
);



INSERT INTO USERS values ("D","A","U",9,"O");
insert into survey values(1,1,'2011-12-18 13:17:17','2011-12-18 13:17:17',1);
insert into organizer values(1,1);
insert into participant values(1,1);
insert into survey_attempted values(1,1,1,'2011-12-18 13:17:17',1);
insert into  question values(1,1,'descript','what is your name');