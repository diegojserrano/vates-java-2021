package curso.clase27.prueba;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/numeros")
public class NumerosEndpoint {


    // parametros para  indicar minimo y maximo.
    @GetMapping("/uno-al-azar")
    public int numero(@RequestParam(value = "min", defaultValue = "0") int minimo,
                      @RequestParam(value = "max", defaultValue = "1000") int maximo) {
        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }
        return new Random().nextInt(maximo-minimo) + minimo;
    }

    // parametros para  indicar minimo y maximo.
    @GetMapping("/uno-al-azar/{min}/{max}")
    public int numero2(@PathVariable("min") int minimo,
                       @PathVariable("max") int maximo) {
        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }
        return new Random().nextInt(maximo-minimo) + minimo;
    }



    @GetMapping("/muchos-al-azar")
    public int[] numeros(
            @RequestParam(value = "min", defaultValue = "0") int minimo,
            @RequestParam(value = "max", defaultValue = "1000") int maximo,
            @RequestParam(value = "cant", defaultValue = "100") int cantidad
    ) {
        return new Random()
                .ints(minimo,maximo)
                .limit(cantidad)
                .toArray();
    }

    @GetMapping("/muchos-al-azar/{min}/{max}/{cant}")
    public int[] numeros2(
            @PathVariable("min")  int minimo,
            @PathVariable("max")  int maximo,
            @PathVariable("cant")  int cantidad
    ) {
        return new Random()
                .ints(minimo,maximo)
                .limit(cantidad)
                .toArray();
    }

}
