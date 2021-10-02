package co.edu.udea.microserviciosudearegistration.api;

import co.edu.udea.microserviciosudearegistration.dto.Contact;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {
    public Contact showContact(){
        return new Contact(
                10L,
                "Elver",
                "Arroyave",
                "+57 301 562 4273",
                "elver.arroyave@udea.edu.co"
        );
    }
}
