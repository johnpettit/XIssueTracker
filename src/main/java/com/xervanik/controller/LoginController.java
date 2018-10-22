package com.xervanik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <h1>LoginController</h1>
 * LoginController for doing Logins and Logouts
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-16
 */
@Controller
public class LoginController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String login(Model model) {
        logger.info("Logging In!");

        return "login.html";
    }

}
