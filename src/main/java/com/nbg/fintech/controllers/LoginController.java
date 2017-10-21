package com.nbg.fintech.controllers;
 

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.nbg.fintech.forms.LoginForm;

@RestController
@RequestMapping("/api/v1")
public interface LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST ) 
    public @ResponseBody RedirectView logonUser(Model model, @Valid @ModelAttribute("login") LoginForm loginForm,
            BindingResult bindingResult) ;
     
}
