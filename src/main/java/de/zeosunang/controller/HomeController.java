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


    @RequestMapping(value = "/")
    public ModelAndView home(HttpServletResponse response) throws IOException {

        return new ModelAndView("home");
    }





    @RequestMapping(value = "equipment")
    public ModelAndView equpment(HttpServletResponse response) {


        Equipment e = new Equipment();

        e.setName("Hanteln");
        e.setNormalizedName("hantel");
        e.setDescription("Eine Hantel");

        try {
            e = equipmentRepository.save(e);
        } catch (RuntimeException ex) {

        }

        LOG.info(e.toString());

        System.out.println(equipmentRepository.findByNormalizedName("hantel").isPresent());



        return new ModelAndView();
    }
}
