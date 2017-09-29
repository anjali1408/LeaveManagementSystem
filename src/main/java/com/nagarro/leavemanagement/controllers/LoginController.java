package main.java.com.nagarro.leavemanagement.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.com.nagarro.leavemanagement.constants.SpringConstants;
import main.java.com.nagarro.leavemanagement.models.Operator;
import main.java.com.nagarro.leavemanagement.services.LoginService;

/**
 * Responsible for handling all the requests related to login.
 * 
 * <br>
 * <br>
 * Since, this class is a Spring Controller class.This class must not be used as
 * any ordinary class.Spring uses this class for mapping the requests to and
 * from the user. <br>
 * <br>
 * 
 * The user should not create the instance of this class as the Spring container
 * automatically registers this class as bean in the application context.
 * 
 * @author nagarro
 * @version 1.0
 */
@Controller
// @ComponentScan("com.nagarro.leavemanagement.service")
public class LoginController {
	@Autowired(required = true)
	@Qualifier("loginService")
	private LoginService loginService;

	// /**
	// * Set {@link FlightService}
	// *
	// * @param flightService
	// * the flightService to set
	// */
	// @Autowired(required = true)
	// public void setLoginService(LoginService loginService) {
	// this.loginService = loginService;
	// }

	/**
	 * Handles request for login page.
	 * 
	 * @param model
	 *            the model object
	 * @return String url to login page
	 */
	@RequestMapping(value = SpringConstants.REQUEST_DEAFULT_PAGE, method = RequestMethod.GET)
	public String getLoginPage(Model model) {
		model.addAttribute(SpringConstants.MODEL_NAME_USER, new Operator());
		return SpringConstants.VIEW_LOGIN_PAGE;
	}

	@RequestMapping(value = SpringConstants.REQUEST_LOGIN_PAGE, method = RequestMethod.GET)
	public String getLogin(Model model) {
		model.addAttribute(SpringConstants.MODEL_NAME_USER, new Operator());
		return SpringConstants.VIEW_LOGIN_PAGE;
	}

	/**
	 * Authenticates the login credentials entered by the end-user.
	 * 
	 * @param p
	 *            the {@link Operator} object
	 * @return url to next page on successful login and login page on
	 *         unsuccessful login.
	 */
	@RequestMapping(value = SpringConstants.REQUEST_LOGIN_PAGE, method = RequestMethod.POST)
	public String authenticateUser(@ModelAttribute(SpringConstants.MODEL_NAME_USER) Operator p, BindingResult result,
			HttpSession session) {
		String resultMsg = SpringConstants.VIEW_LOGIN_PAGE;
		boolean isValid = this.loginService.authenticateUser(p);
		if (isValid) {
			session.setAttribute("searched", loginService.getUser(p).getName());
			return "redirect:admin";
		} else {
			resultMsg = SpringConstants.VIEW_LOGIN_PAGE;
		}
		return resultMsg;
	}

}
