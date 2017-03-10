package de.zeosunang.controller;

import de.zeosunang.model.Equipment;
import de.zeosunang.model.EquipmentRepository;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


	@Autowired
	private EquipmentRepository equipmentRepository;


	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);


	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{

		Equipment e = new Equipment();

		e.setName("Hanteln");
		e.setNormalizedName("hantel");
		e.setDescription("Eine Hantel");


		e = equipmentRepository.save(e);

		LOG.info(e.toString());



		return new ModelAndView("home");
	}
}
