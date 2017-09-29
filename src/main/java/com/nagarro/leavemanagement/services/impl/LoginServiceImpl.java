package main.java.com.nagarro.leavemanagement.services.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import main.java.com.nagarro.leavemanagement.dao.OperatorDao;
import main.java.com.nagarro.leavemanagement.models.Operator;
import main.java.com.nagarro.leavemanagement.services.LoginService;

/**
 * The Class {@link LoginServiceImpl} cab be used to perform operations related
 * to databases.
 * 
 * @author nagarro
 * @version 1.0
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired(required = true)
	private OperatorDao operatorDao;

	// public void setUserDao(OperatorDao userDao) {
	// this.userDao = userDao;
	// }

	/**
	 * Authenticate user according to user input.
	 */
	@Override
	public boolean authenticateUser(Operator user) {
		Logger LOGGER = Logger.getLogger(LoginServiceImpl.class);
		LOGGER.info("Inside Service");
		return operatorDao.authenticateUser(user);

	}

	@Override
	public Operator getUser(Operator user) {
		return operatorDao.getUser(user);
	}

	public OperatorDao getOperatorDao() {
		return operatorDao;
	}

}
