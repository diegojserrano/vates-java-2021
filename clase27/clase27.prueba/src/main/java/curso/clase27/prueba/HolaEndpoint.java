package curso.clase27.prueba;

import org.springframework.web.bind.annotation.*;

import java.util.Random;


@RestController
@RequestMapping("/hola")
public class HolaEndpoint {

    @GetMapping("")
    public String hola(@RequestParam(defaultValue = "mundo") String nombre) {
        return "Hola " + nombre;
    }

    @GetMapping("/{nombre}")
    public String hola2(@PathVariable String nombre) {
        return "Hola " + nombre;
    }

}
