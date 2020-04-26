package com.cg.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class GlobalException {

	@ExceptionHandler({InvalidIdException.class,LoginException.class})
	public String handleException(Exception ex,Model theModel){
		if(ex instanceof InvalidIdException){
			String msg="Invalid Id";
			theModel.addAttribute("message",msg);
			return "error";
		}
		else if(ex instanceof LoginException){
			String msg="Invalid Login Credentials... Go back and retry again";
			theModel.addAttribute("message",msg);
			return "error";
		}
		else
			return null;
	}
}
