package main.java.com.nagarro.leavemanagement.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

import main.java.com.nagarro.leavemanagement.constants.AppConstants;

/**
 * The class {@link Operator} is a model class.<br>
 * This class is a POJO class that models user's login credentials.
 * 
 * @author nagarro
 * @version 1.0
 */
@Entity
@Table(name = AppConstants.OPERATOR_TABLE, uniqueConstraints = {
		@UniqueConstraint(columnNames = AppConstants.TB_USER_ID), @UniqueConstraint(columnNames = "id") })
public class Operator {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = AppConstants.TB_USER_ID)
	private String userId;
	@Column(name = AppConstants.TB_PASSWORD)
	private String password;
	@Column
	private String name;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "operator_role_mapping", joinColumns = {
			@JoinColumn(name = "id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "operator_id", nullable = false, updatable = false) })
	private Set<Role> roles = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return user id for {@link Operator } object
	 * 
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Set user id for {@link Operator } object
	 * 
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Return password for {@link Operator } object
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set password for {@link Operator } object
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
