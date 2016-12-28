package eu.karols.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLoginPage(@RequestParam Optional<String> error) {
        LOGGER.debug("Getting login page, error={}", error);
        return new ModelAndView("login", "error", error);
    }

}

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import eu.karols.forms.LoginForm;
//import eu.karols.services.LoginService;
//import eu.karols.services.UserService;
//
//import javax.validation.Valid;
//
//@Controller
//public class LoginController {
//
//    @Autowired
//    private LoginService loginService;
//
////    @Autowired
////    private NotificationService notifyService;
//
//    @RequestMapping("/users/login")
//    public String login(LoginForm loginForm) {
//        return "users/login";
//    }
//
//    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
//    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
////             notifyService.addErrorMessage("Please fill the form correctly!");
//             return "users/login";
//        }
//
//        if (!loginService.authenticate(
//
//             loginForm.getLogin(), loginForm.getPassword())) {
////             notifyService.addErrorMessage("Invalid login!");
//             return "users/login";
//        }
//
////        notifyService.addInfoMessage("Login successful");
//        return "redirect:/";
//    }
//}
