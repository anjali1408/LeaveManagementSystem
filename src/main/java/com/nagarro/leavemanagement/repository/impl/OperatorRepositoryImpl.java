//package main.java.com.nagarro.leavemanagement.repository.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Isolation;
//import org.springframework.transaction.annotation.Transactional;
//
//import main.java.com.nagarro.leavemanagement.models.Operator;
//import main.java.com.nagarro.leavemanagement.repository.OperatorRepository;
//
//@Repository("repository")
//public class OperatorRepositoryImpl implements OperatorRepository {
//	@Autowired(required = true)
//	@Qualifier("sessionFactory")
//	private SessionFactory sessionFactory;
//
//	/**
//	 * Set {@link SessionFactory} object
//	 *
//	 * @param sf
//	 */
//	public void setSessionFactory(SessionFactory sf) {
//		this.sessionFactory = sf;
//	}
//
//	/**
//	 * Authenticate user on the basis of user input.
//	 */
//	@SuppressWarnings("unchecked")
//	@Override
//	@Transactional(isolation = Isolation.READ_COMMITTED)
//	// @Query(value = "select name where userid=:userid and password=:password")
//	public boolean authenticateUser(Operator userToAuth) {
//		List<Operator> operators = new ArrayList<>();
//		Session session = sessionFactory.getCurrentSession();
//		operators = session.createQuery("from Operator where userid=:userid and password=:password")
//				.setParameter("userid", userToAuth.getUserId()).setParameter("password", userToAuth.getPassword())
//				.list();
//		if (operators.size() > 0)
//			return true;
//		else
//			return false;
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	@Transactional(isolation = Isolation.READ_COMMITTED)
//	// @Query(value = "select name where userid=:userid and password=:password")
//	public Operator getUser(Operator userToAuth) {
//		List<Operator> operators = new ArrayList<>();
//		Session session = sessionFactory.getCurrentSession();
//		operators = session.createQuery("from Operator where userid=:userid and password=:password")
//				.setParameter("userid", userToAuth.getUserId()).setParameter("password", userToAuth.getPassword())
//				.list();
//		if (operators.size() > 0)
//			return operators.get(0);
//		else
//			return null;
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	@Transactional(isolation = Isolation.READ_COMMITTED)
//	public List<Operator> getAll() {
//		Session session = sessionFactory.getCurrentSession();
//		List<Operator> operators = new ArrayList<>();
//		 operators=session.createQuery("from Operator").list();
//		 return operators;
//	}
//
//	// @Override
//	// public Operator save(Operator entity) {
//	// // TODO Auto-generated method stub
//	// return null;
//	// }
//	//
//	// @Override
//	// public Iterable<Operator> save(Iterable<? extends Operator> entities) {
//	// // TODO Auto-generated method stub
//	// return null;
//	// }
//	//
//	// @Override
//	// public Operator findOne(Integer id) {
//	// // TODO Auto-generated method stub
//	// return null;
//	// }
//	//
//	// @Override
//	// public boolean exists(Integer id) {
//	// // TODO Auto-generated method stub
//	// return false;
//	// }
//	//
//	// @Override
//	// public Iterable<Operator> findAll() {
//	// // TODO Auto-generated method stub
//	// return null;
//	// }
//	//
//	// @Override
//	// public Long count() {
//	// // TODO Auto-generated method stub
//	// return null;
//	// }
//	//
//	// @Override
//	// public void delete(Operator entity) {
//	// // TODO Auto-generated method stub
//	//
//	// }
//	//
//	// @Override
//	// public void delete(Iterable<? extends Operator> entities) {
//	// // TODO Auto-generated method stub
//	//
//	// }
//	//
//	// @Override
//	// public void deleteAll() {
//	// // TODO Auto-generated method stub
//	//
//	// }
//}
