package de.zeosunang.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);


	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{

		LOG.info("home called");
		return new ModelAndView("home");
	}
}
