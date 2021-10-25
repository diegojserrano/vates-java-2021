package curso.clase27.prueba;

import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/todos")
    public int[] todos(@Autowired GestorNumeros gn) {
        return gn.listar();
    }

    @PostMapping("/{num}")
    public String agregar(@Autowired GestorNumeros gn, @PathVariable int num) {
        gn.agregar(num);
        return "Agregado";
    }

    @DeleteMapping("/{num}")
    public String borrar(@Autowired GestorNumeros gn,@PathVariable int num) {
        gn.eliminar(num);
        return "Borrado";
    }

    @GetMapping("/{num}")
    public boolean existe(@Autowired GestorNumeros gn, @PathVariable int num) {
        return gn.existe(num);
    }

}
