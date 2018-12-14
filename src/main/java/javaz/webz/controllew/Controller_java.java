package javaz.webz.controllew;

import javaz.webz.entity.Payments;
import javaz.webz.entity.PhoneNumbers;
import javaz.webz.entity.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import repository.ConfigurationInterface;
import repository.Configuration_Interface_1_phone_numbers;

@Controller
public class Controller_java {

    @Autowired
    ConfigurationInterface configurationInterface;
    @Autowired
    Configuration_Interface_1_phone_numbers configurationInterface_1;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView();

        Payments payments = configurationInterface.findByName("aaa");
modelAndView.addObject("pay",payments);
        modelAndView.setViewName("index");
//        return modelAndView;
//        ModelAndView modelAndView_services = new ModelAndView();

        PhoneNumbers services = configurationInterface_1.findByServices("RedFeel");
        modelAndView.addObject("ser", services);
//        modelAndView_services.setViewName("index");
        return modelAndView;
    }
}

