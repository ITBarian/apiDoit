package cat.itb.doit.apirest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping("/")
    public String index() {
        //has to be without blank spaces
        return "index";
    }
}
