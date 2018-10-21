package com.xervanik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <h1>HomeController</h1>
 * HomeController for doing Home operations
 *
 * @author  John Pettit
 * @version 1.0
 * @since   2018-10-15
 */
@Controller
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "home.html";
    }
}