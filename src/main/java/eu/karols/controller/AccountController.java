package eu.karols.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import eu.karols.forms.LoginForm;
import eu.karols.services.LoginService;

import javax.validation.Valid;
import java.util.Objects;

@Controller
public class AccountController {

//    @Autowired
//    private NotificationService notificationService;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String showLoginForm(LoginForm loginForm) {
        return "login";
    }

    @RequestMapping(value = "/login",
            method = RequestMethod.POST)
    public String showLoginForm(
            @Valid LoginForm loginForm,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
//            notificationService.addErrorMessage("notify!");
            return "login";
        }

        if (! loginService.authenticate(loginForm.getLogin(),
                loginForm.getPassword())) {
//            notificationService.addErrorMessage("Invalid login");
            return "login";
        }

        // Login successful
//        notificationService.addInfoMessage("Notify!");
        return "redirect:/";
    }
}