package se.ulvhamne.vampirecat.rest

import se.ulvhamne.vampirecat.data.CatUser

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.Response

@Path("user")
class UserResource {
    @GET
    @Produces("application/json")
    fun getCatUser(): Response = Response.ok(CatUser()).build()
}
