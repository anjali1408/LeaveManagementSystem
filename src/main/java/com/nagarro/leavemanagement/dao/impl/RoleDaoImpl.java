package main.java.com.nagarro.leavemanagement.dao.impl;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import main.java.com.nagarro.leavemanagement.dao.RoleDao;

/**
 * Provides implementation for the {@link OperatorDao} methods. <br>
 * This class performs the actual interaction with the data source. <br>
 * <br>
 * The user of the application should not directly use this class,instead use
 * class for performing data store operations.
 * 
 * @author nagarro
 * @version 1.0
 */
@Repository
public class RoleDaoImpl implements RoleDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(RoleDaoImpl.class);
//	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Set {@link SessionFactory} object
	 * 
	 * @param sf
	 */
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

//	/**
//	 * Authenticate user on the basis of user input.
//	 */
//	@Override
//	public boolean authenticateUser(Operator userToAuth) {
//		LOGGER.info("Inside DAO");
//		boolean isValidUser = false;
//		Session session = this.sessionFactory.getCurrentSession();
//		Operator user = (Operator) session.get(Operator.class, new String(userToAuth.getUserId()));
//		if (user != null) {
//			if (user.getPassword().equals(userToAuth.getPassword())) {
//				isValidUser = true;
//			}
//		}
//		return isValidUser;
//	}

}
