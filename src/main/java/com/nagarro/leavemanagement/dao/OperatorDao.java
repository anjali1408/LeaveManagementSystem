package main.java.com.nagarro.leavemanagement.dao;

import java.util.List;

import main.java.com.nagarro.leavemanagement.models.Operator;

/**
 * Provides implementation for the database related functionalities.
 * 
 * @author nagarro
 * @version 1.0
 * 
 */
public interface OperatorDao {
	/**
	 * checks that if a user exists or not, if a valid {@link User} entry
	 * returns that means this user exists.If this function returns
	 * <code>false</code>, that means the user does not exists.
	 * 
	 * @param user
	 *            {@link User}
	 * @return true if user exists otherwise false.
	 */
	boolean authenticateUser(Operator user);

	Operator getUser(Operator userToAuth);

	List<Operator> getAllUser();
}
