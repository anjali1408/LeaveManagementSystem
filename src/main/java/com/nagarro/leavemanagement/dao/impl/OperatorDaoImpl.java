package main.java.com.nagarro.leavemanagement.dao.impl;

import java.util.List;

import main.java.com.nagarro.leavemanagement.dao.OperatorDao;
import main.java.com.nagarro.leavemanagement.models.Operator;
import main.java.com.nagarro.leavemanagement.repository.OperatorRepository;
import main.java.com.nagarro.leavemanagement.services.impl.LoginServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Provides implementation for the {@link OperatorDao} methods. <br>
 * This class performs the actual interaction with the data source. <br>
 * <br>
 * The user of the application should not directly use this class,instead use
 * {@link LoginServiceImpl} class for performing data store operations.
 * 
 * @author nagarro
 * @version 1.0
 */
 @Repository
public class OperatorDaoImpl implements OperatorDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(OperatorDaoImpl.class);

	@Autowired
	private OperatorRepository operatorRepository;

	/**
	 * Authenticate user on the basis of user input.
	 */
	@Override
	public boolean authenticateUser(Operator userToAuth) {
		LOGGER.info("Inside DAO");
		return operatorRepository.authenticateUser(userToAuth.getUserId(),userToAuth.getPassword());
	}

	@Override
	public Operator getUser(Operator userToAuth) {
		return operatorRepository.getUser(userToAuth.getUserId(),userToAuth.getPassword());
	}

	@Override
	public List<Operator> getAllUser() {
		return operatorRepository.getAll();
	}

}
