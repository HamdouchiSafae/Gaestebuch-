package de.htwberlin.gaestebuch.Gaeste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GeastebuchController {
    @GetMapping(path = "/")
    public ModelAndView showHelloWorldPage(){
        return new ModelAndView("gaestebuch");
    }
}

