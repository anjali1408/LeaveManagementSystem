package main.java.com.nagarro.leavemanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.com.nagarro.leavemanagement.models.Operator;
import main.java.com.nagarro.leavemanagement.services.UserService;


@Controller
public class AdminController {

//	@Autowired
//	private FlightService flightService;
//
	@Autowired
	private UserService userService;
//
//	@Autowired
//	private IPrivilegeService iPrivilegeService;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String renderProfile(Model model) {
		return "admin";
	}

	@RequestMapping(value = "/ahome")
	public String renderAdminHome() {
		return "ahome";
	}
//
//	@RequestMapping(value = "/aflight")
//	public String renderAdminFlight(Model model) {
//		List<Flightpojo> allFlights = flightService.getAllFlights();
//		model.addAttribute("adminFlights", allFlights);
//		return "aflight";
//	}
//
	@RequestMapping(value = "/auser")
	public String renderAdminUser(Model model) {
		List<Operator> allUsers = userService.getAllUser();
		model.addAttribute("adminUsers", allUsers);
		return "auser";
	}
//
//	/*
//	 * Methods for deleting Records
//	 */
//
//	@RequestMapping(value = "/deleteflight")
//	public String deleteFlight(Model model,
//			@RequestParam("flight_id") String flight_id) {
//		flightService.deleteFlight(new Integer(flight_id));
//		List<Flightpojo> allFlights = flightService.getAllFlights();
//		model.addAttribute("adminFlights", allFlights);
//		return "aflight";
//	}
//
//	@RequestMapping(value = "/deleteuser")
//	public String deleteUser(Model model,
//			@RequestParam("user_id") String user_id) {
//
//		userService.deleteUser(new Integer(user_id));
//		List<User> allUsers = userService.getAllUsers();
//		model.addAttribute("adminUsers", allUsers);
//		return "auser";
//	}
//
//	/*
//	 * Methods for editing Records
//	 */
//
//	/*
//	 * Methods for editing Flights
//	 */
//
//	@RequestMapping(value = "/editflight")
//	public String editFlight(Model model,
//			@RequestParam("flight_id") String flight_id, HttpSession session) {
//		model.addAttribute("editFDto",
//				flightService.getFlightEditDto(new Integer(flight_id)));
//		return "editflight";
//	}
//
//	@RequestMapping(value = "/editflight", method = RequestMethod.POST, params = { "completeFEditing" })
//	public String completeFEditing(
//			@ModelAttribute("editFDto") FlightEditDto flightDto,
//			BindingResult result, HttpSession session) {
//		flightService.editSFlight(flightDto);
//		return "redirect:/aflight";
//	}
//
//	@RequestMapping(value = "/editflight", method = RequestMethod.POST, params = { "cancelFEditing" })
//	public String cancelFEditing(
//			@ModelAttribute("editFDto") FlightEditDto flightDto,
//			BindingResult result, HttpSession session) {
//		return "redirect:/aflight";
//	}
//
//	/*
//	 * Methods for editing Users
//	 */
//
//	@RequestMapping(value = "/edituser")
//	public String editUser(Model model,
//			@RequestParam("user_id") String user_id, HttpSession session) {
//		model.addAttribute("editUDto",
//				userService.getUserEditDto(new Integer(user_id)));
//		return "edituser";
//	}
//
//	@RequestMapping(value = "/edituser", method = RequestMethod.POST, params = { "completeUEditing" })
//	public String completeUEditing(
//			@ModelAttribute("editUDto") UserEditDto userDto,
//			BindingResult result, HttpSession session) {
//		userService.editSUser(userDto);
//		return "redirect:/auser";
//	}
//
//	@RequestMapping(value = "/edituser", method = RequestMethod.POST, params = { "cancelUEditing" })
//	public String cancelUEditing(
//			@ModelAttribute("editUDto") UserEditDto userDto,
//			BindingResult result, HttpSession session) {
//		return "redirect:/auser";
//	}
//
//	/*
//	 * Methods for adding records
//	 */
//	/*
//	 * Methods for adding flights
//	 */
//
//	@RequestMapping(value = "/addflight")
//	public String addFlight(Model model) {
//		model.addAttribute("addFDto", new FlightEditDto());
//		return "addflight";
//	}
//
//	@RequestMapping(value = "/addflight", method = RequestMethod.POST, params = { "addFlightFinish" })
//	public String addFlightFinish(
//			@ModelAttribute("addFDto") FlightEditDto flightDto,
//			BindingResult result, HttpSession session) {
//		flightService.addAdminFlight(flightDto);
//		return "redirect:/aflight";
//	}
//
//	@RequestMapping(value = "/addflight", method = RequestMethod.POST, params = { "cancelFlightFinish" })
//	public String cancelFlightFinish(
//			@ModelAttribute("addFDto") FlightEditDto flightDto,
//			BindingResult result, HttpSession session) {
//		return "redirect:/aflight";
//	}
//
//	/*
//	 * Methods for adding Users
//	 */
//	@RequestMapping(value = "/adduser")
//	public String addUser(Model model) {
//		model.addAttribute("addUDto", new UserDto());
//		return "adduser";
//	}
//
//	@RequestMapping(value = "/adduser", method = RequestMethod.POST, params = { "addUserFinish" })
//	public String addUserFinish(@ModelAttribute("addUDto") UserDto userDto,
//			BindingResult result, HttpSession session) {
//		userService.register(userDto,
//				iPrivilegeService.getPrivilege(userDto.getuPrivilege()));
//		return "redirect:/auser";
//	}
//
//	@RequestMapping(value = "/adduser", method = RequestMethod.POST, params = { "cancelUserFinish" })
//	public String cancelUserFinish(@ModelAttribute("addUDto") UserDto userDto,
//			BindingResult result, HttpSession session) {
//		return "redirect:/auser";
//	}

}
