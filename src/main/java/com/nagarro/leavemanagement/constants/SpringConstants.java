package main.java.com.nagarro.leavemanagement.constants;

/**
 * Contains all the spring constants used in application.
 * 
 * @author nagarro
 * @version 1.0
 */
public class SpringConstants {

	public static final String VIEW_LOGIN_PAGE = "login";
	public static final String VIEW_HOME_PAGE = "home";

	public static final String REQUEST_DEAFULT_PAGE = "/";
	public static final String REQUEST_HOME_PAGE = "/home";
	public static final String REQUEST_LOGIN_PAGE = "/login";
	public static final String REQUEST_RESULT = "/result";
	public static final String REDIRECT_HOME_PAGE = "redirect:/home";

	public static final String MODEL_NAME_USER = "user";
	public static final String MODEL_NAME_FLIGHT_SEARCHING_PARAMETERS = "flightSearchingParameters";
	public static final String MODEL_NAME_MATCHED_FLIGHT = "matchedFlights";

	public static final String PARAM_DEPARTURE_LIST = "departureList";
	public static final String PARAM_ARRIVAL_LIST = "arrivalList";

	private SpringConstants() {

	}
}
