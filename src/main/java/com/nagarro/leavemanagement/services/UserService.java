package main.java.com.nagarro.leavemanagement.services;

import java.util.List;

import main.java.com.nagarro.leavemanagement.models.Operator;

/**
 * The class {@link UserService} is a service class.<br>
 * This class provides the database related services.
 * 
 * @author nagarro
 * @version 1.0
 * 
 */
public interface UserService {
	/**
	 * checks that if a user exists or not, if a valid {@link Operator} entry
	 * returns that means this user exists.If this function returns
	 * <code>false</code>, that means the user does not exists.
	 * 
	 * @param user
	 *            {@link Operator}
	 * @return true if user exists otherwise false.
	 */

	List<Operator> getAllUser();

}
