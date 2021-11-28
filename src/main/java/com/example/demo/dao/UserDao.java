package com.example.demo.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	Logger logger= LoggerFactory.getLogger(UserDao.class);
public void save()
{
	logger.debug(" save() : Method excution get started");
	logger.info(" Record inserted into DB succesfully");
	logger.debug("save() : Method excution complited");
	}
}
