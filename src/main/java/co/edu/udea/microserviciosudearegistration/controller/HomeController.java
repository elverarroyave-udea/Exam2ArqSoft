package co.edu.udea.microserviciosudearegistration.controller;

import co.edu.udea.microserviciosudearegistration.api.ContactApi;
import co.edu.udea.microserviciosudearegistration.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @Autowired
    private ContactApi contactApi;

    @GetMapping("/hello")
    public String message(){
        return "Hola desde Spring, Elver Arroyave";
    }

    @GetMapping("/contact")
    public ResponseEntity<Contact> showContact(){
        return ResponseEntity.ok(contactApi.showContact());
    }

}
