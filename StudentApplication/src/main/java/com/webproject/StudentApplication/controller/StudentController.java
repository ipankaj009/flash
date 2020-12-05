package com.webproject.StudentApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webproject.StudentApplication.model.StudentData;
import com.webproject.StudentApplication.model.StudentLoginData;
import com.webproject.StudentApplication.services.StudentLoginService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentLoginService studService;
	
	@RequestMapping("/login")
	public ModelAndView loginStudent(StudentLoginData login)
	{
		
		System.out.println("...............Inside Login.............."+login);
		ModelAndView mav = new ModelAndView();
		
		if(studService.validateStudent(login))
		{
			String message = "Login Successful";
			mav.addObject("LoginSuccessful",message);
			mav.setViewName("home.jsp");
			return mav;
		}else
		{
			String message = "Login failed";
			mav.addObject("msg", message);
			mav.setViewName("login.jsp");
			return mav;
		}
	}
	
	@RequestMapping("/register")
	public ModelAndView registerStudent(StudentData data)
	{
		ModelAndView mav = new ModelAndView();
		
		if(studService.registeringStudent(data))
		{
			String msg = " Registration successful , now login into account";
			mav.addObject("msg",msg);
			mav.setViewName("login.jsp");
			return mav;
		}
		else
		{
			String msg = " Registration unsuccessful";
			mav.addObject("msg",msg);
			mav.setViewName("registration.jsp");
			return mav;
		}
		
	}
	
	
}
