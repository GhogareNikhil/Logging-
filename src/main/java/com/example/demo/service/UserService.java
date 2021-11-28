package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;

@Service
public class UserService {

	
	@Autowired
	UserDao userDao;
	
	Logger logger= LoggerFactory.getLogger(UserService.class);
	 public void saveUser()
	 {
		 logger.debug(" saveUSer() : Method excution get started");
			//logger.info(" Record inserted into DB succesfully");
		 userDao.save();
			logger.debug("saveUser() : Method excution complited");
	 }
}
