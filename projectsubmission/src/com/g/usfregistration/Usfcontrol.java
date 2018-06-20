package com.g.usfregistration;


import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Usfcontrol{
	@RequestMapping(value="/UserForm.jsp" , method = RequestMethod.GET)
	public ModelAndView getUserForm(){
		ModelAndView mode1 = new ModelAndView("User Form");
		
		return mode1;
		
	}
	
@RequestMapping(value="/submitUserForm.jsp" , method = RequestMethod.POST)
public ModelAndView submitUserForm(@ModelAttribute("user") user user ){
	 
	ModelAndView mode1 = new ModelAndView(" form submission Success");
	return mode1;
}
	
	
	
	
	
	
	
	
}