package main.java.com.nagarro.leavemanagement.repository;

import java.util.List;

import main.java.com.nagarro.leavemanagement.models.Operator;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.User;

public interface OperatorRepository extends Repository<Operator, Integer> {
	/**
	 * s checks that if a user exists or not, if a valid {@link User} entry
	 * returns that means this user exists.If this function returns
	 * <code>false</code>, that means the user does not exists.
	 *
	 * @param user
	 *            {@link User}
	 * @return true if user exists otherwise false.
	 */
	@Query(value = "from Operator where userid=:userid and password=:password")
	public Operator getUser(@Param("userid") String userId, @Param("password") String password);

	@Query(value = "from Operator where userid=:userid and password=:password")
	boolean authenticateUser(@Param("userid") String userId, @Param("password") String password);

	@Query(value = "from Operator")
	List<Operator> getAll();
}
