package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomePageController {

    @RequestMapping
    ModelAndView homePage(){
        ModelAndView mnv = new ModelAndView("index");
        mnv.addObject("index");
        return mnv;
    }
}
