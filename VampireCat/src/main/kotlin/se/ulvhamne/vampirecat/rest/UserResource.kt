package se.ulvhamne.vampirecat.rest

import se.ulvhamne.vampirecat.data.CatUser
import se.ulvhamne.vampirecat.rest.requests.CatUserUpdateRequest
import javax.validation.Valid
import javax.ws.rs.*

import javax.ws.rs.core.Response

@Path("user")
class UserResource {
    @GET
    @Produces("application/json")
    fun getCatUser(): Response = Response.ok(CatUser()).build()

     @POST
     @Consumes("application/json")
     fun updateCatUser(@Valid userUpdateRequest: CatUserUpdateRequest): Response = Response.ok().build()


    @DELETE
    @Produces("application/json")
    fun deleteCatUser(): Response = Response.ok().build()

    @POST
    @Path("/image")
    fun addImage(): Response = Response.ok().build()

    @DELETE
    @Path("/image")
    fun deleteImage(imageId: String): Response = Response.ok().build()

}
