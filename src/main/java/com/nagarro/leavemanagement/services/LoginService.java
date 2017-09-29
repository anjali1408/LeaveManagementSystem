package main.java.com.nagarro.leavemanagement.services;

import main.java.com.nagarro.leavemanagement.models.Operator;

/**
 * The class {@link LoginService} is a service class.<br>
 * This class provides the database related services.
 * 
 * @author nagarro
 * @version 1.0
 * 
 */
public interface LoginService {
	/**
	 * checks that if a user exists or not, if a valid {@link Operator} entry
	 * returns that means this user exists.If this function returns
	 * <code>false</code>, that means the user does not exists.
	 * 
	 * @param user
	 *            {@link Operator}
	 * @return true if user exists otherwise false.
	 */
	boolean authenticateUser(Operator p);

	Operator getUser(Operator user);

}
