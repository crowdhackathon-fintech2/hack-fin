package com.nbg.fintech.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.nbg.fintech.forms.LoginForm;
 
@Component
public class LoginControllerImpl implements LoginController {

	  private static final Logger logger = LoggerFactory.getLogger(LoginControllerImpl.class);
  

	   @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public RedirectView logonUser(Model model, @Valid @ModelAttribute("login") LoginForm loginForm,
	            BindingResult bindingResult) { 
		   
		   if ( loginForm.getUsername().equals("admin")) {
			   return new RedirectView("/admin.html");
		   } else if ( loginForm.getUsername().equals("client")) {
			   return new RedirectView("/client.html");
		   
		   } else if ( loginForm.getUsername().equals("business")) {
			   return new RedirectView("/business.html");
		   } else {
			   return new RedirectView("/pages/login.html");
		   } 
	   }
	 
}
