package curso.clase27.prueba;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@RestController
public class ErrorEndpoint implements ErrorController {

    @RequestMapping("/error")
    public String error(HttpServletRequest request) {

        String mensaje = (String)request.getAttribute(RequestDispatcher.ERROR_MESSAGE);
        return "Ocurrió un error: " + mensaje;
    }



}
