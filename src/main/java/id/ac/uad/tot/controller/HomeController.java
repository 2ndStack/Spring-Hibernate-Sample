package id.ac.uad.tot.controller;

/**
 * Created by Deny Prasetyo,S.T
 * Java(Script) Developer and Trainer
 * Co-Founder | 2ndStack Studio
 * jasoet87@gmail.com
 * <p/>
 * http://github.com/jasoet
 * http://bitbucket.com/jasoet
 * <p/>
 * [at]jasoet
 */

import id.ac.uad.tot.domain.TripType;
import id.ac.uad.tot.repository.TripTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private TripTypeRepository tripTypeRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap modelMap) {

        return "home";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(@RequestParam(value = "name", defaultValue = "") String name, ModelMap modelMap) {

        List<TripType> data = (List<TripType>) tripTypeRepository.findByName("%" + name + "%");

        modelMap.addAttribute("data", data);

        return "about";
    }


    @ResponseBody
    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public List<TripType> jsonAbout(@RequestParam(value = "name", defaultValue = "") String name) {
        return tripTypeRepository.findByName("%" + name + "%");
    }

}

