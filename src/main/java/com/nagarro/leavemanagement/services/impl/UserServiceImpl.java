package main.java.com.nagarro.leavemanagement.services.impl;

import java.util.List;

import main.java.com.nagarro.leavemanagement.dao.OperatorDao;
import main.java.com.nagarro.leavemanagement.models.Operator;
import main.java.com.nagarro.leavemanagement.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class {@link UserServiceImpl} cab be used to perform operations related
 * to databases.
 *
 * @author nagarro
 * @version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired(required = true)
	private OperatorDao operatorDao;

	@Override
	public List<Operator> getAllUser() {
		return operatorDao.getAllUser();
	}

	public OperatorDao getOperatorDao() {
		return operatorDao;
	}

}
