package de.htwberlin.gaestebuch.Gaeste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class GaestebuchController {
    @GetMapping(path = "/")
    public ModelAndView showGaestebuchPage(){
        return new ModelAndView("gaestebuch");
    }
}
