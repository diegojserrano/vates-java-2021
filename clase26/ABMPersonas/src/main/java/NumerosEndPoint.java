import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.Random;

// Esta clase posee endpoints
// Todos navegables debajo de http://sitio/ABMPersonas/api/numeros
@Path("/numeros")
public class NumerosEndPoint {

    private int contador = 0;

    @GET
    @Path("/unosolo")
    public int unoSolo(@QueryParam("maximo") int maximo) {
        if (maximo == 0) maximo = 1000;
        return new Random().nextInt(maximo);
    }

    @GET
    @Path("/muchos/{cantidad}/{minimo}/{maximo}")
    public int[] muchos(
            @PathParam("cantidad") int cantidad,
            @PathParam("minimo") int minimo,
            @PathParam("maximo") int maximo
    ) {
        if (cantidad < 1) cantidad = 100;
        if (minimo < 1) minimo = 1;
        if (maximo < 1 || maximo <= minimo) maximo = minimo + 1;

        return new Random()
            .ints(minimo,maximo)
            .limit(cantidad)
            .toArray();
    }

    @GET @Path("/contar")
    public int contar() {
        return ++contador;
    }


    @GET @Path("/cantidad")
    public int cantidad() {
        return contador;
    }


}
