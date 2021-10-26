package cat.itb.doit.apirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/hola")
    String holaMundo(){
        return "hola mundo";
    }
}
