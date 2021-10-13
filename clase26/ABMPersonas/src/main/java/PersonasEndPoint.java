import javax.ws.rs.*;
import java.util.Collection;

@Path("/personas")
public class PersonasEndPoint {

    @GET
    @Path("/{documento}")
    public Persona unasola(@PathParam("documento") int documento) {
        return ListaPersonas.getInstance().obtener(documento);
    }

    @GET
    @Path("/")
    public Collection<Persona> todas() {
        return ListaPersonas.getInstance().obtenerTodas();
    }

    @POST
    @Consumes("application/json")
    @Path("/")
    public int agregar(Persona nueva) {
        ListaPersonas.getInstance().agregar(nueva);
        return nueva.getDocumento();
    }



}
