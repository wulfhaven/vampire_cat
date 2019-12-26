package se.ulvhamne.vampirecat.rest

import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.Path
import javax.ws.rs.core.Response
import javax.ws.rs.GET
import javax.ws.rs.Produces

@ApplicationScoped
@Path("/")
class HelloWorldEndpoint {
    @GET
    @Produces("text/plain")
    fun doGet(): Response {
        return Response.ok("This is not the rest resource you're looking for.").build()
    }
}
