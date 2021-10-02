package co.edu.udea.microserviciosudearegistration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @GetMapping("/")
    public String message(){
        return "Hola desde Spring, Elver Arroyave";
    }
}
