package main.java.com.nagarro.leavemanagement.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This class holds responsibility of logging a user
 * out of the application and invaldiating the session
 * @author anjaliverma
 *
 */
@Controller
public class LogoutController {
	
//	private Logger logger = Logger.getLogger(HomeController.class);
	
	/**
	 * this method is used to process logout functionalities
	 * @param request request object associated with the session
	 * @return redirection to login page
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPro(HttpServletRequest request)
	{
		request.getSession().removeAttribute("searched");
		request.getSession().invalidate();
//		logger.info("loging out ********************************************8");
		return "redirect:login";
	}

}
