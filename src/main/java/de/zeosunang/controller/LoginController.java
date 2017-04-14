package de.zeosunang.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Zeosunang on 14.04.2017.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletResponse response) {
        return new ModelAndView("login/login");
    }

}
