package curso.clase27.prueba;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorEndpoint implements ErrorController {

    @RequestMapping("/error")
    public String error() {
        return "Ocurrió un error";
    }



}
