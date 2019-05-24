package com.example.demo.bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
	UserDaoImpl userDaoImpl;

	@RequestMapping("/")
	public String showMain() {
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView getLogin(@ModelAttribute("register") UserMaster userMaster) {

		userMaster.getUserId();
		userMaster.getPassWord();
		ModelAndView mav = null;
		System.out.println("hellow");
//		int count = userDaoImpl.register(userMaster);
		int count = 1;
		if (count > 0) {
			System.out.println("login");
			mav = new ModelAndView("login");
			mav.addObject("success", "user has been successfully registered ,please login with the credenntials");
		} else {
			mav = new ModelAndView("register");

			mav.addObject("failure", "something went wrong please register after some time");
		}
		return mav;
	}

	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new UserMaster());
		return mav;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") UserMaster userMaster) {

		System.out.println(userMaster);
		System.out.println(userMaster.getPassWord());
		ModelAndView mav = null;
		System.out.println("hellow world");
		mav = new ModelAndView("welcome");
		mav.addObject("firstname", userMaster.getUserId());
//		UserMaster userMasterReturn = userDaoImpl.validateUser(userMaster);
//		if (null != userMasterReturn) {
//			mav = new ModelAndView("welcome");
//			mav.addObject("firstname", userMasterReturn.getUserId());
//		} else {
//			mav = new ModelAndView("login");
		// mav.addObject("message", "Username or Password is wrong!!");
		// }
		return mav;
	}
}
